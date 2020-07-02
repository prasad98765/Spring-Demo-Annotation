package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theSillyCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	
	@Value("${foo.email}") 
	String email;
	
	@Value("${foo.Message}")
	String Message;
	
	@Value("${foo.EndMessage}")
	String EndMessage;
	
	// Autowired for Field Injection by Annotations
	// Also Add @Qualifier Annotation
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("Called Default Constructor");
	}
	
	/*
	// Autowired for Method Injection by Annotations
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("Inside doSomeCrazyStuff");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	// Autowired for Setter Injection by Annotations
	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("Inside setFortuneService");
		fortuneService = thefortuneService;
	}
	*/

	/*
	 * // Autowired for constructor by Annotations //@Autowired public
	 * TennisCoach(FortuneService thefortuneService) { fortuneService =
	 * thefortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Paractice your backhand valley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getForune();
	}
	@Override
	public String getEmail() {
		return email;
	}
	
	// define my init method
	@PostConstruct
	private void DoMyStartupStiff() {
		System.out.println(Message);
	}
	
	// define my destory method
	@PreDestroy
	private void doMyCleanupStuff() {
		System.out.println(EndMessage);

	}
}
