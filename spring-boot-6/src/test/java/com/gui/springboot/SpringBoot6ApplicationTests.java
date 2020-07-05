package com.gui.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBoot6ApplicationTests {

    @Test
    void contextLoads() {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
