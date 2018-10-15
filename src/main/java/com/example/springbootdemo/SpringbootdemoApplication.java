package com.example.springbootdemo;

import com.example.springbootdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

    @Autowired
    HelloService helloService;

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index(){
//        return "bookAuthor:"+bookAuthor+"  bookName:"+bookName;
        return helloService.sayHello();
    }




    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);

//        SpringApplication app=new SpringApplication(SpringbootdemoApplication.class);

    }
}
