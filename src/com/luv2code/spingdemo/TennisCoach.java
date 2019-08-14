package com.luv2code.spingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortune;

    /*@Autowired
    public TennisCoach(FortuneService theFortune) {
        fortune = theFortune;
    }*/

    //init method
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println(">> TennisCoach: inside doMyStartUpStuff method");
    }
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println(">> TennisCoach: inside doMyCleanUpStuff method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortune) {
//        System.out.println(">> TennisCoach: inside method");
//        this.fortune = fortune;
//    }
}
