package voctrals.study.springboot.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple Rest Controller
 *
 * @author voctrals
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello() {
        return "Hello world from springboot";
    }

    // import value from application.properties
    @Value("${author.name}")
    private String authorName;

    @RequestMapping("/author")
    public String authorInfo(@Value("${author.tel}") String authorTel) {
        return "作者姓名：" + authorName + "，电话：" + authorTel;
    }

    @Autowired
    private StrutsInfo strutsInfo;

    @RequestMapping("/struts")
    public String strutsInfo() {
        return strutsInfo.toString();
    }

    @Autowired
    private CompanyInfo companyInfo;

    @RequestMapping("/company")
    public String company() {
        return companyInfo.toString();
    }

    /**
     * 1，--spring.profiles.active=prod
     * 2，application内指定spring.profiles.active=prod
     * 3，不指定的话默认找application中默认的值
     * 4，通过@Profile注解指定
     */
    @Value("${application.state}")
    private String applicationState;

    @RequestMapping("/state")
    public String state() {
        return applicationState;
    }
}