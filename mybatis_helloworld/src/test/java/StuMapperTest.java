import cn.zhaoqw.bean.Student;
import cn.zhaoqw.uitls.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-17 9:58]
 */
public class StuMapperTest {


    @Test
    public void testCase1() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        List<Student> students = sqlSession.selectList("student.selectAllStudent");
        students.forEach(System.out::println);
        MyBatisUtils.closeSession(sqlSession);
    }
}
