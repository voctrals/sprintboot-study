package voctrals.study.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean注解
 *
 * @author voctrals
 */
// spring bean配置最推荐的方式
@Configuration
public class BeanConfig {

    @Bean
    public PersonService personService() {
        return () -> "You are beautiful, you are handsome";
    }

}
