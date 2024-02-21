package com.litethinking.livespringbootdemo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

public class StringUtilitiesServiceTest {

    @InjectMocks
    StringUtilitiesService stringUtilitiesService;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenStringIsNotNull_thenReturnSize(){
        String input = "ABCDE";
        int expectedLength = 5;
        int result = stringUtilitiesService.getSizeOfString(Optional.of(input));
        assert expectedLength == result;
    }

    @Test
    public void whenStringIsNull_thenReturnZero(){
        String input = null;
        int expectedLength = 0;
        int result = stringUtilitiesService.getSizeOfString(Optional.ofNullable(input));
        assert expectedLength == result;
    }
}
