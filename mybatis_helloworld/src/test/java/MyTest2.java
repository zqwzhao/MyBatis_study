import cn.zhaoqw.bean.Emp;
import cn.zhaoqw.dto.EmpDto;
import cn.zhaoqw.uitls.MyBatisUtils;
import com.mysql.cj.Session;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-11 20:58]
 */
public class MyTest2 {


    @Test
    public void testMyBatisUtils(){
        SqlSession sqlSession = MyBatisUtils.openSession();
        Connection connection = sqlSession.getConnection();
        System.out.println(connection);
        MyBatisUtils.closeSession(sqlSession);
    }


    @Test
    public void testCourseSelect() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        List<Object> objects = sqlSession.selectList("course.selectAll");
        for (Object object : objects) {
            System.out.println(object);
        }


    }

    @Test
    public void testSelectById() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        Object o = sqlSession.selectOne("course.selectById",1);
        System.out.println(o);

    }

    @Test
    public void testSelectEmpsMap() {
        SqlSession session = null;
        try{
            session = MyBatisUtils.openSession();
            List<Map> list = session.selectList("empDept.selectEmpsMap");
            for (Map map : list) {
                System.out.println(map);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectEmpDto(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtils.openSession();
            List<EmpDto> dtos = sqlSession.selectList("empDept.selectEmpDto");
            dtos.forEach(System.out::println);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }
    }


    @Test
    public void testSelectAllEmp() {
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtils.openSession();
            List<Map> objects = sqlSession.selectList("empDept.selectAllEmp");
            for (Map object : objects) {
                System.out.println(object);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            sqlSession.close();
        }
    }


    @Test
    public void TestSelectEmpByNoAndName() {
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtils.openSession();
            Emp emp1 = new Emp();
            emp1.setEmpno(7934);
            emp1.setEname("MILLER");
            List<Emp> emps = sqlSession.selectList("empDept.selectEmpByNoAndName",emp1);
            for (Emp emp : emps) {
                System.out.println(emp);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
