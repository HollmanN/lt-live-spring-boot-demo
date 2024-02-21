package com.litethinking.livespringbootdemo.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StringUtilitiesService {

    public int getSizeOfString(Optional<String> input){
        return input.map(String::length).orElse(0);
    }
}
