package voctrals.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Bean相关的请求测试
 *
 * @author voctrals
 */
@RestController
public class AboutBean {

    @Autowired
    private PersonService personService;

    @RequestMapping("/bean")
    public String getBean() {
        return personService.say();
    }

}
