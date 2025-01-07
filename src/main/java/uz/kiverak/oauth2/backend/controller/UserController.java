package uz.kiverak.oauth2.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user") // базовый URI
public class UserController {

    @GetMapping("/data")
    public String user() {
        return "user data";
    }

}
