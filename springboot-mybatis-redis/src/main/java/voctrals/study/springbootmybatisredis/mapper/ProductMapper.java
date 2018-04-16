package voctrals.study.springbootmybatisredis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import voctrals.study.springbootmybatisredis.entity.Product;

import java.util.List;

/**
 * 产品DAO
 *
 * @author voctrals
 */
@Mapper
public interface ProductMapper {

    List<Product> all();

    Product select(@Param("id") long id);

    void update(Product product);

    void insert(Product product);
}