package com.wk.boardHigh.test.controller;

import com.wk.boardHigh.test.service.TestService;
import com.wk.boardHigh.test.vo.TestVo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boardHigh")
public class TestContrller {

    @Autowired
    private Environment env;

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/get/test", method = RequestMethod.GET)
    public List<TestVo> getTest() {
        return testService.getTest();
    }

    @RequestMapping(value = "/get/port", method = RequestMethod.GET)
    public String check(HttpServletRequest request) {
        return String.format("Server port PORT %s", env.getProperty("local.server.port"));
    }

    @RequestMapping(value = "/get/ok", method = RequestMethod.GET)
    public ResponseEntity<String> getPort() {
        return ResponseEntity.ok("포트 정보");
    }

}
