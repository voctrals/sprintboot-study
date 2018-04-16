package voctrals.study.springbootmybatisredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * springboot with mybaits
 * <p>
 * second cache by redis
 *
 * @author voctrals
 */
@SpringBootApplication
public class SpringbootMybatisRedisApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootMybatisRedisApplication.class, args);
    }
}
