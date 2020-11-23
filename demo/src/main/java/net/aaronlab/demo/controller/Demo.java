package net.aaronlab.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/demo")
public class Demo {

    @GetMapping(value = "/data")
    public HashMap<String, String> get(String apiKey) {
        HashMap<String, String> map = new HashMap<>();
        if (apiKey.equals("qwertyasdf1234")) {
            map.put("id", apiKey);
            map.put("firstName", "Aaron");
            map.put("lastName", "Lee");
            map.put("email", "aaronlab.net@gmail.com");
        }
        return map;
    }
}
