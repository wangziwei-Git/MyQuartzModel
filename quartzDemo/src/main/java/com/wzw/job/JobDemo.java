package com.wzw.job;

import java.util.Date;

/**
 * 第一个Quartz定时任务调度框架
 *  *      快速入门:自定义job任务类
 * @Author: wzw
 * @Date: 2020/11/13 15:40
 * @version: 1.8
 */
public class JobDemo {
    /**
     *测试方法
     */
    public void run(){
        //让其不断自动执行
        System.out.println("job execute...,执行时间:"+new Date());
    }
}
