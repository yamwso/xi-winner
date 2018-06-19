package com.imooc.sell.VO;

import lombok.Data;

/**
 * http返回的最外层对象
 */
@Data
public class ResultVO <T>{
    //错误码
    private Integer code;
    //具体信息
    private String msg;
    //具体内容
    private T data;
}
