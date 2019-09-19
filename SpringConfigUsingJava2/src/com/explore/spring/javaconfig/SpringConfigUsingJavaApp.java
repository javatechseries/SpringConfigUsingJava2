package com.explore.spring.javaconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringConfigUsingJavaApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		 SwimCoach swimCoach=ctxt.getBean("swimCoach", SwimCoach.class);
		  System.out.println("Swim Coach: "+swimCoach.getDailyWorkout());
		  System.out.println("Swim Coach Future: "+swimCoach.getDailyFortune());
		  System.out.println("Coach email is: "+swimCoach.getEmail());
		  System.out.println("Team name is: "+swimCoach.getTeam());
		
		
		ctxt.close();

	}

}
