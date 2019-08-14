package com.luv2code.spingdemo;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is sad day!";
    }
}
