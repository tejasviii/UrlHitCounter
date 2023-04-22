package com.example.UrlHitCounter.Controller;


import com.example.UrlHitCounter.Model.UrlHit;
import com.example.UrlHitCounter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-counter-app")
public class UrlHitCounter {
    @Autowired
    private UrlHitService hitService;

    // http://localhost:8080/api/v1/visitor-counter-app/username/Tejasvi/count
    @GetMapping("username/{username}/count")
    public UrlHit getCount(@PathVariable String username){
        UrlHit visit = hitService.getVisit(username);
        return visit;
    }
}
