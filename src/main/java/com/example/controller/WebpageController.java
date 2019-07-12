package com.example.controller;

import com.example.service.WebpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webpage")
public class WebpageController {

    @Autowired
    private WebpageService webpageService;

    @GetMapping("isoppenid")
    public String isoppenid(@RequestParam(required = true) String oppenid){

        String url = webpageService.selectOppenId(oppenid);

        return url;
    }

}
