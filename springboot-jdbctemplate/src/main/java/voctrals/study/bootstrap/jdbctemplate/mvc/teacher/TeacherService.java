package voctrals.study.bootstrap.jdbctemplate.mvc.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service
 *
 * @author voctrals
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> getTeacherByBeanPropertyRowMapper() {
        return teacherDao.getAllByBeanPropertyRowMapper();
    }

    public List<Teacher> getByTeacherRowMapper() {
        return teacherDao.getAllByRowMapper();
    }
}
