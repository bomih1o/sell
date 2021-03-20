package com.team.sell.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVo<T> implements Serializable {

    /** 错误码.*/
    private Integer code;
    /** 提示信息. */
    private String message;
    /** 具体内容. */
    private T data;

}
