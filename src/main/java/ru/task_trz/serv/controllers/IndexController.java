package ru.task_trz.serv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String checkIndex() {
        return "<h1>Welcome to Task-trz-serv</h1>\r\n<p>Version: " + getClass().getPackage().getImplementationVersion() + "</p>\r\n";
    }
}
