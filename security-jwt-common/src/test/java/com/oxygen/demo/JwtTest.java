package com.oxygen.demo;


import com.oxygen.demo.utils.RsaUtils;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class JwtTest {
    private String privateKey = "c:/tools/auth_key/id_key_rsa";

    private String publicKey = "c:/tools/auth_key/id_key_rsa.pub";

    @Test
    public void test1() throws Exception{
        RsaUtils.generateKey(publicKey,privateKey,"dpb",1024);
    }


    @Test
    public void test2(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("123123"));

        //PasswordEncoder passwordEncoder = new PasswordEncoder() ;
    }

}
