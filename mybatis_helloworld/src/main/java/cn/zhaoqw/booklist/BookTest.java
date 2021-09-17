package cn.zhaoqw.booklist;

import java.io.*;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class BookTest {

    //存储图书信息
    private List<Book> booksList= null;
    {

        booksList = new ArrayList<>();
    }

    public void go() {
        getBooks();
        booksList.forEach(System.out::println);
        System.out.println("=========================================");
        bookSort(5);
        booksList.forEach(System.out::println);
        ListSortUtil.sort(booksList,"price",false);
        System.out.println("=========================================");
        booksList.forEach(System.out::println);
    }

    private void bookSort(int i) {
        switch(i) {
            case 1:
                //按照书名进行排序
                Collections.sort(booksList, (book1,book2)-> book1.getBookName().compareTo(book2.getBookName()));
                break;
            case 2:
                //按照作者进行排序
                Collections.sort(booksList, (book1,book2)-> book1.getAuthor().compareTo(book2.getAuthor()));
                break;
            case 3:
                //按照价格进行排序
                Collections.sort(booksList, (book1,book2)-> book1.getPrice().compareTo(book2.getPrice()));
                break;
            case 4:
                //按照ISBN号进行排序
                Collections.sort(booksList, (book1,book2)-> book1.getISBN().compareTo(book2.getISBN()));
                break;
            case 5:
                //按照bookId号进行排序
                Collections.sort(booksList, (book1,book2)-> book1.getBookId().compareTo(book2.getBookId()));
                break;
        }
    }



    public void getBooks() {
        File file = new File("t_book.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] taken = line.split("/");
                Book book = new Book();
                book.setBookId(taken[0]);
                book.setBookName(taken[1]);
                book.setAuthor(taken[2]);
                book.setTypeId(Integer.parseInt(taken[3]));
                book.setPrice(Double.parseDouble(taken[4]));
                book.setISBN(taken[5]);
                book.setPublishing(taken[6]);
                book.setPublishTime(new SimpleDateFormat("yyyy-MM-dd").parse(taken[7]));
                book.setInstroduce(taken[8]);
                book.setStaus(taken[9].toCharArray()[0]);
                booksList.add(book);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new BookTest().go();
    }
}
