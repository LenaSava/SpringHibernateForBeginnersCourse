package com.luv2code.spingdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {


        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);
        //call a method
        System.out.println("are they same" + result);

        System.out.println("theCoach" + theCoach);
        System.out.println("alphaCoach" + alphaCoach);
        //close context
        context.close();
    }
}
