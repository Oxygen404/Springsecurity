package com.oxygen.demo.config;


import com.oxygen.demo.utils.RsaUtils;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;


import javax.annotation.PostConstruct;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 提供公钥私钥的配置类
 */
@Data
@ConfigurationProperties(prefix = "rsa.key")
public class RsaKeyProperties {


    private String pubKeyFile;

    private String priKeyFile;

    private PublicKey publicKey;
    private PrivateKey privateKey;

    /**
     * 系统启动的时候触发
     * @throws Exception
     */
    @PostConstruct
    public void createRsaKey() throws Exception {
        publicKey = RsaUtils.getPublicKey(pubKeyFile);
        privateKey = RsaUtils.getPrivateKey(priKeyFile);
    }

}
