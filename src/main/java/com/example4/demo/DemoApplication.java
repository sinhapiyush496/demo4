package com.example4.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class DemoApplication {


    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("piyush");
    }

        @RequestMapping("/hi")
        public int display()
        {
            final int i = 9;
            return i;
        }
    }





