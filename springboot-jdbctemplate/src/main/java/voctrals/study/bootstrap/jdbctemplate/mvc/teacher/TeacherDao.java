package voctrals.study.bootstrap.jdbctemplate.mvc.teacher;

import java.util.List;

/**
 * Dao
 *
 * @author voctrals
 */
public interface TeacherDao {

    List<Teacher> getAllByRowMapper();

    List<Teacher> getAllByBeanPropertyRowMapper();
}
