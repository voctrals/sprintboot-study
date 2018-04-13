package voctrals.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import voctrals.study.springboot.springmvc.StrutsInfo;

/**
 * Springboot step by step
 *
 * @author voctrals
 */
// basic
@SpringBootApplication
// 等价于
//@SpringBootConfiguration // 等同于@Configuration）
//@ComponentScan // 默认扫描该包及子包下的所有bean
//@EnableAutoConfiguration //
// 配置文件内容导入类后，需要如下注解将配置类转化为bean
@EnableConfigurationProperties(StrutsInfo.class)
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
