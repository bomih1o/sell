package com.team.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    CANCEL(2, "已取消"),
    FINISHED(1, "完结"),
    NEW(0, "新订单"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
