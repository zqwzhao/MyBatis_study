import cn.zhaoqw.bean.User;
import cn.zhaoqw.dao.EmpDao;
import cn.zhaoqw.dao.UserDao;
import cn.zhaoqw.uitls.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-17 20:07]
 */
public class UserMapperTest {

    public static SqlSessionFactory sqlSessionFactory= null;
    static {
        String config = "mybatis-config.xml";
        InputStream stream = null;
        try {
            stream = Resources.getResourceAsStream(config);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("niudiewei2");
        user.setPassword("343434");
        mapper.insertUser(user);
        sqlSession.commit();
        MyBatisUtils.closeSession(sqlSession);
    }
}
