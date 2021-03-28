package com.oxygen.demo.mapper;


import com.oxygen.demo.pojo.UserPojo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {

    //@Select("select * from t_user where username = #{userName}")
    public UserPojo queryByUserName(@Param("userName") String userName);
}
