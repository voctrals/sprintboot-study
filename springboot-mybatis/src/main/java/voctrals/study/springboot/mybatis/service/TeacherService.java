package voctrals.study.springboot.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import voctrals.study.springboot.mybatis.entity.Teacher;
import voctrals.study.springboot.mybatis.mapper.TeacherMapper;

import java.util.List;

/**
 * Service
 *
 * @author voctrals
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherDao;

    public List<Teacher> getAll() {
        return teacherDao.getAll();
    }

    @Transactional(rollbackFor = IndexOutOfBoundsException.class)
    public int insert(Teacher teacher) {
        int i = teacherDao.insert(teacher);

        System.out.println(1 / 0);

        int j = teacherDao.insert(teacher);
        return i + j;
    }
}
