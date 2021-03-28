package com.oxygen.demo.service.impl;

import com.oxygen.demo.mapper.UserMapper;
import com.oxygen.demo.pojo.UserPojo;
import com.oxygen.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserPojo user = mapper.queryByUserName(s);

        return user;
    }
}
