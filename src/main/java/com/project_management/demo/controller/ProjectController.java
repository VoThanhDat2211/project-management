package com.project_management.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class ProjectController {
    private static final Logger logger
            = LoggerFactory.getLogger(ProjectController.class);

    @GetMapping("/")
    public void test() {
        logger.info("test info");
        logger.error("test error");
        logger.error("test error2");
        logger.error("test error3");
        System.out.println(logger);
    }
}
