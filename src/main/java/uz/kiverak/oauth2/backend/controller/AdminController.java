package uz.kiverak.oauth2.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin") // базовый URI
public class AdminController {

    @GetMapping("/data")
    public String admin() {
        return "admin data";
    }



}
