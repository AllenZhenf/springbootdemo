package com.example.springbootdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Allen
 * @create 2018-09-30 上午 11:11
 * @desc
 **/
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG="world";

    private String msg=MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
