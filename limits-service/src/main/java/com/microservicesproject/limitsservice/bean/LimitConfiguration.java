package com.microservicesproject.limitsservice.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class LimitConfiguration {
private int maximum;
private int minimum;

@Autowired
private Configuration configuration;

protected LimitConfiguration()
{
	
}

public void setMaximum(int maximum) {
	this.maximum = maximum;
}




public void setMinimum(int minimum) {
	this.minimum = minimum;
}
 



public int getMaximum() {
	return maximum;
}
public int getMinimum() {
	return minimum;
}
public LimitConfiguration(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}




}
