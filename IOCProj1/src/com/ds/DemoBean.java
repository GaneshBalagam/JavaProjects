package com.ds;

import java.util.Calendar;

public class DemoBean implements Demo{
	//bean property
	private String msg;
	//setter method supporting setter injuction

	public void setMsg(String msg) {
		this.msg = msg;
	}
	//implement b.method
	public String generateWishMsg(String user)
	{
	//get system date and time
		Calendar cl=Calendar.getInstance();
		//get current hour of the day
		int h=cl.get(Calendar.HOUR_OF_DAY);
		//generate wish mesage
		if(h<12)
			return msg+"good morning:"+user;
		else if(h<=16)
			return msg+"good afternoon:"+user;
		else if(h<=20)
			return msg+"good evening:"+user;
		else
			return msg+"good night:"+user;
	}
}
	


