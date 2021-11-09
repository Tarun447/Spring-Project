package com.nit.beans;

import java.util.Date;

public class Hello {
private Date date;

public void setDate(Date date)
{
	this.date = date;
}

public int getHour()
{
	return date.getHours();
}

}
