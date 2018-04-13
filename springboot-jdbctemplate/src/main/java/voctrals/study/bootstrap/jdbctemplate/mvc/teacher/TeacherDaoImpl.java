package voctrals.study.bootstrap.jdbctemplate.mvc.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Dao Implement
 *
 * @author voctrals
 */
@Repository
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Teacher> getAllByRowMapper() {
        List<Teacher> result;

        result = jdbcTemplate.query("select id, name, type from teacher", new RowMapper<Teacher>() {
            @Nullable
            @Override
            public Teacher mapRow(ResultSet resultSet, int i) throws SQLException {
                Teacher teacher = new Teacher();
                teacher.setId(resultSet.getInt("id"));
                teacher.setName(resultSet.getString("name"));
                teacher.setType(resultSet.getString("type"));
                return teacher;
            }
        });

        return result;
    }

    @Override
    public List<Teacher> getAllByBeanPropertyRowMapper() {
        List<Teacher> result;

        result = jdbcTemplate.query("select id, name, type from teacher", new BeanPropertyRowMapper<>(Teacher.class));

        return result;
    }
}
