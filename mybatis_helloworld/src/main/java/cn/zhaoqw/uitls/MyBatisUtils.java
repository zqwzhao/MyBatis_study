package cn.zhaoqw.uitls;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-11 17:59]
 */
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    /**
     * @return
     */
    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }

    /**
     *
     * @param sqlSession
     */
    public static void closeSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
