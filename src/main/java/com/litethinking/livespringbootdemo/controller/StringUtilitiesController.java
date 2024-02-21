package com.litethinking.livespringbootdemo.controller;

import com.litethinking.livespringbootdemo.domain.MicroserviceParameter;
import com.litethinking.livespringbootdemo.service.StringUtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StringUtilitiesController {

    private final StringUtilitiesService stringUtilitiesService;

    @Autowired
    public StringUtilitiesController(StringUtilitiesService stringUtilitiesService) {
        this.stringUtilitiesService = stringUtilitiesService;
    }

    @PostMapping("/length/")
    public int getLength(@RequestBody MicroserviceParameter input) {
        return stringUtilitiesService.getSizeOfString(Optional.of(input.input()));
    }
}
