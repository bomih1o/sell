package com.team.sell.repository;
import static org.junit.Assert.*;
import com.team.sell.pojo.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){

        Optional<ProductCategory> productCategory = repository.findById(1);
        log.info(productCategory.get().toString());

    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(2);
        productCategory = repository.save(productCategory);
        assertThat(repository.findById(productCategory.getCategoryId())).hasValue(productCategory);
    }

    @Test
    public void updateTest(){
        Optional<ProductCategory> result = repository.findById(3);
        ProductCategory category = result.orElse(null);
        category.setCategoryName("老婆最爱");
        repository.save(category);
    }

    @Test
    public void deleteTest(){
        repository.deleteById(5);
    }


}