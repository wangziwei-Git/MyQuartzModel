package com.wzw.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wzw
 * @Date: 2020/11/13 16:33
 * @version: 1.8
 */
public class App {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("application-jobs.xml");
    }
}
