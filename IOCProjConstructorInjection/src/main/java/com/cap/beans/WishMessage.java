package com.cap.beans;

import java.util.Date;

public class WishMessage {
private Date date;

public WishMessage(Date date)
{
	this.date = date;
}
	
public String sayGreet(String user)
{
	int hr = date.getHours();
	if(hr<12)
		return "Good Morning "+user;
	else if(hr<16)
	     return "Good AfterNoon "+user;
	else if(hr<20)
		return "Good Evening "+user;
	else
		return "Good Night "+user;
}
}
