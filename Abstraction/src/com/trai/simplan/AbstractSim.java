package com.trai.simplan;

public abstract class AbstractSim
{
	public abstract void call();

	public abstract void sms();

	public void sos()
	{
		System.out.println("Emergency");
	}
}
