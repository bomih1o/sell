package com.team.sell.repository;

import com.team.sell.pojo.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,Integer> {

    Page<OrderMaster> findByBuyerOpenid(String openid,Pageable pageable);

}
