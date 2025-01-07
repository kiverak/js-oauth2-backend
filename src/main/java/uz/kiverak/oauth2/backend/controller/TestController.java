package uz.kiverak.oauth2.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test") // базовый URI
public class TestController {

    @GetMapping("/data")
    public String test() {
        return "test data";
    }

}
