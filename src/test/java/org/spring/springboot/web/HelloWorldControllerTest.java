package org.spring.springboot.web;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

/**
 * Spring Boot HelloWorldController 测试 - {@link HelloWorldController}
 *
 * Created by bysocket on 16/4/26.
 */
public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello, welcome to visit XBank!",new HelloWorldController().sayHello());
    }
}
