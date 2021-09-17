import cn.zhaoqw.bean.Emp;
import cn.zhaoqw.dao.EmpDao;
import cn.zhaoqw.uitls.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-10 10:40]
 */
public class MyTest {
    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void init() {
        // 根据全局配置文件创建出SqlSessionFactory
        // SqlSessionFactory:负责创建SqlSession对象的工厂
        // SqlSession:表示跟数据库建议的一次会话
        String resource = "mybatis-config.xml";
        InputStream resourceAsStream = null;

        try {
            resourceAsStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);


    }


    @Test
    public void testEmpDao()  {
        //获取数据库会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Emp emp = mapper.selectEmpEmpno(8002);
        System.out.println(emp);

    }


    @Test
    public void test02() {
        //SqlSession sqlSession = sqlSessionFactory.openSession(true); 如果不想使用commit方法的话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(2004);
        emp.setEname("niudiewei");
        Integer save = mapper.save(emp);
        System.out.println(save);
        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void test03() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(2004);
        emp.setEname("shangsan");
        emp.setSal(6666.00);
        Integer update = mapper.update(emp);
        System.out.println(update);
        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void test04() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);

        Integer delete = mapper.delete(2004);
        System.out.println(delete);


    }

    @Test
    public void testInsertEmp() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Integer niudiewei = mapper.insertEmp("niudiewei");
        System.out.println(niudiewei);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void getAllEmpReturnMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Map<Integer, Emp> allEmpReturnMap = mapper.getAllEmpReturnMap();
        allEmpReturnMap.forEach((k,v) -> System.out.println(k.toString() +":" + v.toString()));
        sqlSession.close();
    }
}
