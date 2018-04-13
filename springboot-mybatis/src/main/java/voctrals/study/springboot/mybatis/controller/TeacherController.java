package voctrals.study.springboot.mybatis.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import voctrals.study.springboot.mybatis.entity.Teacher;
import voctrals.study.springboot.mybatis.service.TeacherService;

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

    @RequestMapping("/list")
    public String teacherList() {
        return JSON.toJSONString(teacherService.getAll());
    }

    @RequestMapping("/create")
    public String teacherAdd() {
        Teacher teacher = new Teacher();
        teacher.setName("蒋老师");
        teacher.setType("software");

        teacherService.insert(teacher);

        return JSON.toJSONString(teacherService.getAll());
    }
}
