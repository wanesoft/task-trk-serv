package ru.task_trz.serv.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {
    private static final Logger log = LogManager.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String checkIndex(HttpServletRequest request) {
        String clientAddress = request.getRemoteAddr();
        String clientUserAgent = request.getHeader("user-agent");

        log.debug("Incoming message from " + clientAddress + ", browser: " + clientUserAgent);

        String ret = "<h1>Welcome to Task-trz-serv!!!</h1>\r\n";
        ret += "<p>Your address: " + clientAddress + "</p>\r\n";
        ret += "<p>Your browser: " + clientUserAgent + "</p>\r\n";
        ret += "<br>";
        ret += "<p>Version: " + getClass().getPackage().getImplementationVersion() + "</p>\r\n";

        return ret;
    }
}