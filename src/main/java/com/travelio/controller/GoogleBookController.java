package com.travelio.controller;

import com.travelio.entity.GoogleBookWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class GoogleBookController {

    @RequestMapping(value = "/")
    public String getGoogleBook(@RequestParam(value = "keyword", required = false) String keyword, Model model){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity entity = restTemplate.getForEntity("https://www.googleapis.com/books/v1/volumes?q=" + keyword, GoogleBookWrapper.class);
        GoogleBookWrapper googleBookWrapper = (GoogleBookWrapper) entity.getBody();
        model.addAttribute("listBook", googleBookWrapper.getItems());
        System.out.println(googleBookWrapper.getItems()[0].getVolumeInfo().getTitle());
        return "index";
    }
}