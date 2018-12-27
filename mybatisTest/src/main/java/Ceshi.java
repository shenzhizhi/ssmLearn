import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Ceshi {
    public static void main(String[] args) {
        String resource="mybatis.xml";
        try {
            InputStream inputStream= Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession=sqlSessionFactory.openSession();
            SonDao sonDao=sqlSession.getMapper(SonDao.class);

            Son son1 =new Son();
            son1.setName("jianzhi");
            son1.setAge(24);
            sonDao.insert(son1);


            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        https://www.cnblogs.com/yyy88168/p/3201238.html
    }
}
