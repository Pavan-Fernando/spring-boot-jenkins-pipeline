package org.jenkins.example.springbootjenkinspipeline;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsPipelineApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(SpringBootJenkinsPipelineApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("test cases running");
    }

}
