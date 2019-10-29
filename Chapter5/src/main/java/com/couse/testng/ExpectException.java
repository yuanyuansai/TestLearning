package com.couse.testng;

import com.sun.xml.internal.bind.v2.model.runtime.RuntimeTypeInfo;
import org.testng.annotations.Test;

public class ExpectException {
    /**
     * 什么时候会用到异常测试
     * 在我们期望结果为某一个异常的时候
     * 比如传入一个异常的参数
     * 也就是说我们的预期结果就是这个异常
     */

    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaild(){
        System.out.println("这是一个失败的异常测试" );
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw  new RuntimeException();


    }
}
