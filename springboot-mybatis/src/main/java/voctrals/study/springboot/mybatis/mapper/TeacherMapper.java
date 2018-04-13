package voctrals.study.springboot.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import voctrals.study.springboot.mybatis.entity.Teacher;

import java.util.List;

/**
 * Mybatis Mapper
 *
 * @author voctrals
 */
@Mapper
public interface TeacherMapper {
    List<Teacher> getAll();

    int insert(Teacher teacher);
}
