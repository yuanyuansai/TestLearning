package com.couse.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){

        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是再测试之前运行的");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("这是在方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuite测试套件");
    }
}
