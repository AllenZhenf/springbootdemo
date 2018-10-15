package com.example.springbootdemo.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author Allen
 * @create 2018-09-30 上午 10:36
 * @desc
 **/
@Configuration
@EnableConfigurationProperties(HttpEncodingProperties.class)
@ConditionalOnClass(CharacterEncodingFilter.class) //当CharacterEncodingFilter在类路径的条件下
@ConditionalOnProperty(prefix="spring.http.encoding",value="enabled",matchIfMissing = true) //当设置spring.http.encoding=enabled的情况下，如果没有则默认为true，即条件符合
public class HttpEncodingAutoConfiguration {

    @Autowired
    private HttpEncodingProperties httpEncodingProperties;

    @Bean
    @ConditionalOnMissingBean(CharacterEncodingFilter.class)//当容器中没有这个bean时新建bean
    public CharacterEncodingFilter characterEncodingFilter(){
        CharacterEncodingFilter characterEncodingFilter=new OrderedCharacterEncodingFilter();
        characterEncodingFilter.setEncoding(this.httpEncodingProperties.getCharset().name());
        characterEncodingFilter.setForceEncoding(this.httpEncodingProperties.isForce());
        return characterEncodingFilter;
    }
}
