package voctrals.study.springboot.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Springboot Mybatis
 * <p>
 * 1, Autodetect an existing DataSource.
 * 2, Will create and register an instance of a SqlSessionFactory passing that DataSource as an input using the SqlSessionFactoryBean.
 * 3, Will create and register an instance of a SqlSessionTemplate got out of the SqlSessionFactory.
 * 4, Autoscan your mappers, link them to the SqlSessionTemplate and register them to Spring context so they can be injected into your beans.
 *
 * @author voctrals
 */
@SpringBootApplication
public class MybatisApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MybatisApplication.class);

        System.out.println(context.getBean(DataSource.class));
        System.out.println(context.getBean(SqlSessionFactory.class));
        System.out.println(context.getBean(SqlSessionTemplate.class));
        // attention ................
        System.out.println(context.getBean(SqlSession.class) == context.getBean(SqlSessionTemplate.class));
        // attention ................
        System.out.println(context.getBean(JdbcTemplate.class));

    }
}
