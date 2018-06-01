package com.trai.simplan;
public class MainRunner1 
{
public static void main(String[] args) 
{
	AbstractSim as= new AirtelSim();
	as.call();
	as.sms();
	as.sos();
	
	//as.info();
	
	AirtelSim at=(AirtelSim)as;
	at.info();

}
}
