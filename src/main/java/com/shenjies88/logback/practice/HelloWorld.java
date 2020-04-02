package com.shenjies88.logback.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shenjies88
 * @since 2020/4/1-5:35 PM
 */
class HelloWorld {

    public static void main(String[] args) throws InterruptedException {

        Logger logger = LoggerFactory.getLogger("com.shenjies88.logback.practice.HelloWorld");
        int i = 10;
        while (i > 0) {
            logger.debug("Hello world debug {}", i--);
            logger.info("Hello world info {}", i--);
            Thread.sleep(1000);
        }
    }
}