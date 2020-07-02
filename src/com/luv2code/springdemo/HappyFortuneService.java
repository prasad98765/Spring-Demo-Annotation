package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getForune() {
		return "Today Is Your Lucy Day";
	}

}
