package com.zied.demo.Fibonacci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/number")
public class FibController {

    private final FibService fibService;



    @Autowired
    public FibController(FibService fibService) {
        this.fibService = fibService;
    }

    @GetMapping(path = "{rank}")
    public int getNumber(@PathVariable("rank") int rank){
        return fibService.getNumber(rank);
    }
}


