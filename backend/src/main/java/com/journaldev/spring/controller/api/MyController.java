package com.journaldev.spring.controller.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author slemoine
 */
@RestController
@RequestMapping("/api/mycontroller")
public class MyController {

    @GetMapping
    public Map<String, String> getValue() {
        Map<String, String> response = new HashMap<>();
        response.put("data", "a chunk of data");
        return response;
    }
}
