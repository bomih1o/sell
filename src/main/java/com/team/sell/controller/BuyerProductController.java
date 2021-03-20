package com.team.sell.controller;

import com.team.sell.pojo.ProductInfo;
import com.team.sell.service.ProductCategoryService;
import com.team.sell.service.ProductInfoService;
import com.team.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVo list(){
        //1. 查询所有的上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        //2. 查询类目（一次性查询）
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());

        //3. 数据拼装
        
        return null;
    }

}
