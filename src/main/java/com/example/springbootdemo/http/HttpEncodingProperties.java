package com.example.springbootdemo.http;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;


/**
 * @author Allen
 * @create 2018-09-20 下午 5:51
 * @desc http编码
 **/
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {

    public static final Charset DEFAULT_CHARSET= Charset.forName("UTF-8");

    private Charset charset=DEFAULT_CHARSET;

    private boolean force=true;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
