package com.example.springbootdemo.service;

/**
 * @author Allen
 * @create 2018-09-30 上午 11:16
 * @desc
 **/
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello"+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
