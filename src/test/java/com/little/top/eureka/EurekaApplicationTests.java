package com.little.top.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        Arrays.asList( "a", "b", "d" ).forEach(e -> {
            System.out.print( e );
            System.out.print( e );
        } );
    }
}
