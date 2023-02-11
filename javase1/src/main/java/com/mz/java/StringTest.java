package com.mz.java;

import org.junit.Test;

/**
 * @Author: MZ
 * @Date: 2023/2/10 12:18
 * @Description:
 */
public class StringTest {

    @Test
    public  void  test1() {
        String a = "1234AA";
        int i=100;
        a.length();
        a.charAt(1);
        a.isEmpty();
        a.toLowerCase();
        a.toUpperCase();
        a.equalsIgnoreCase(a);
        a.concat("666");
        System.out.println(String.valueOf(i).getClass());




    }


}
