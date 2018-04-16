package voctrals.study.springbootmybatisredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import voctrals.study.springbootmybatisredis.entity.Product;
import voctrals.study.springbootmybatisredis.mapper.ProductMapper;

/**
 * 产品控制器
 *
 * @author voctrals
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/{id}")
    public Product getProductInfo(@PathVariable("id") Long productId) {
        return productMapper.select(productId);
    }

    @PutMapping("/{id}")
    public Product updateProductInfo(@PathVariable("id") Long productId, @RequestBody Product newProduct) {
        newProduct.setId(productId);
        productMapper.update(newProduct);
        return newProduct;
    }

    @PostMapping("/")
    public Object createProductInfo(@RequestBody Product newProduct) {
        productMapper.insert(newProduct);
        return productMapper.all();
    }
}