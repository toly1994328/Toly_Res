package com.toly1994.toly_test;

import com.toly1994.toly_test.Cons.ZData;
import com.toly1994.toly_test.random.ZRandom;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        String[] xing = ZData.XING;
        String[] ming = ZData.MING;
        String[] CONG_CONG = ZData.CONG_CONG;
        String[] SPRING = ZData.SPRING;
        String[] PROVINCES = ZData.PROVINCES;

//        //随机输出1~20个字符组成的字符串
        System.out.println(ZRandom.randomChar(20));
//
//        //指定字符数组,随机选取1~20个字符组成的字符串
        System.out.println(ZRandom.randomChar( ZData.CONG_CONG,20));

        //指定字符数组,选取15~20个字符组成的字符串
        System.out.println(ZRandom.randomChar( ZData.CONG_CONG,15,20));


        //随机中文名---百家姓+随机名
        System.out.println(ZRandom.randomCnName());
        //4+6随机英文组合
        System.out.println(ZRandom.randomEnName());

    }
}