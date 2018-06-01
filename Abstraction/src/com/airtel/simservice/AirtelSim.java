package com.airtel.simservice;

import com.trai.simplan.AbstractSim;

public class AirtelSim extends AbstractSim {

	@Override
	public void call() {
		System.out.println("2g call");
	}

	@Override
	public void sms() {
		System.out.println("SMS");
	}

}