package com.reliance.simservice;

import com.trai.simplan.AbstractSim;

public class JioSim extends AbstractSim 
{

	@Override
	public void call() {
		System.out.println("4g call services");
	}

	@Override
	public void sms() {
		System.out.println("Digital sms");
	}

}
