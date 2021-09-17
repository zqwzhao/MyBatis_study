package cn.zhaoqw.bean;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-17 9:54]
 */
public class Student {
    private int id;
    private int regNo;
    private String name;
    private String sex;
    private int age;
    private String grade;
    private String major;

    public Student() {
    }

    public Student(int id, int regNo, String name, String sex, int age, String grade, String major) {
        this.id = id;
        this.regNo = regNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", regNo=" + regNo +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
