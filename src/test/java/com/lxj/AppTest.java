package com.lxj;

import static org.junit.Assert.assertTrue;

import com.lxj.ip.mapper.UserMapper;
import org.junit.Test;
import proxy.DynamicProxyHandler;

import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException {
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler();
        UserMapper userMapper = (UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(), new Class[]{UserMapper.class},
                dynamicProxyHandler);

        userMapper.getById(1L);
    }

//    private <T> T test(int i) {
//        switch (i) {
//            case 1:
//                return new Integer(i);
//
//        }
//        return
//    }

}
