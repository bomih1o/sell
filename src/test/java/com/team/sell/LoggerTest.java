package com.team.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){
        //log.info("name:{},password:{}",name,password);
        BigDecimal total = new BigDecimal("190520");
        List<String> numList = Arrays.asList("15336743.0344","34223423.23","3675375.345623","2344434.459456","5623774.23");
        BigDecimal sum = new BigDecimal(0);
        for (String num:numList) {
            sum = sum.add(new BigDecimal(num));
        }
        BigDecimal price = total.divide(sum,12, BigDecimal.ROUND_DOWN);
        log.info("total:{} , price:{}",total,price);
        for (String num : numList) {
            BigDecimal val = new BigDecimal(num);
            BigDecimal m = val.multiply(price).setScale(2,BigDecimal.ROUND_DOWN);
            log.info("{}",m);
        }
    }
}