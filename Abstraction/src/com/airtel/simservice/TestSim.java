package com.airtel.simservice;

import com.reliance.simservice.JioSim;
import com.trai.simplan.AbstractSim;

public class TestSim {
	public static void main(String[] args)
	{
		AbstractSim a = new JioSim();
		a.call();
		a.sms();
		a.sos();
		
		System.out.println("-------------------");
				a=new AirtelSim();
		a.call();
		a.sms();
		a.sos();
	}
}
