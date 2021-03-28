package com.oxygen.demo.domian;

import lombok.Data;

import java.util.Date;

/**
 * @author: Oxygen
 * @date: 2021/3/27 14:44
 * @purpose:
 */
@Data
public class Payload <T>{
    private String id;
    private T userInfo;
    private Date expiration;
}
