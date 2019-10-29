package com.couse.testng.suite;

import org.testng.annotations.Test;

public class PayTest {
    @Test(enabled = false)
    public void paySuccess(){
        System.out.println("支付宝支付成功");
    }
}
