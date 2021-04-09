package com.team.sell.service;

import com.team.sell.dto.CartDTO;
import com.team.sell.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/***
 * 商品
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaseStock(List<CartDTO> cartDTOList);

    // 减库存
    void decreaseStock(List<CartDTO> cartDTOList);

}
