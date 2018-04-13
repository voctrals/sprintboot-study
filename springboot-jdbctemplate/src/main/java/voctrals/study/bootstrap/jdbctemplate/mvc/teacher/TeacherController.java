package voctrals.study.bootstrap.jdbctemplate.mvc.teacher;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author voctrals
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/list1")
    public String teacherList1() {
        return JSON.toJSONString(teacherService.getByTeacherRowMapper());
    }

    @RequestMapping("/list2")
    public String teacherList2() {
        return JSON.toJSONString(teacherService.getTeacherByBeanPropertyRowMapper());
    }
}
