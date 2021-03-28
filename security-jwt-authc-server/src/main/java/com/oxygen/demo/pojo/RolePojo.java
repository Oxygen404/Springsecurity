package com.oxygen.demo.pojo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 完成数据认证的逻辑
 */
@Data
public class RolePojo implements GrantedAuthority {

    private Integer id;
    private String roleName;
    private String roleDesc;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return roleName;
    }
}

