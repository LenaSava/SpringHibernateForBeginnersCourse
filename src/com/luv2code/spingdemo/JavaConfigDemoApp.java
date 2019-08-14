package com.luv2code.spingdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {


        //read spring config JavaClass
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        //call a method
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());
        //close context
        context.close();
    }
}
