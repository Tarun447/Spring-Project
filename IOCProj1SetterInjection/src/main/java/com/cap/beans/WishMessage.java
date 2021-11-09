// target class wish message generator

package com.cap.beans;

import java.util.Date;
public class WishMessage {
private Date date;

public void  setDate(Date date)
{
	this.date = date;
}

public String greet(String user)
{
	int hr = date.getHours();
	if(hr<12)
		return "Good Morning "+user;
	else if(hr<16)
		return "Good Afternoon "+user;
	else if(hr<20)
		return "Good Evening "+user;
	else
		return "Good night "+user;
}
}
