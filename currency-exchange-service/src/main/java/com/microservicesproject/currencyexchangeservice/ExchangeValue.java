package com.microservicesproject.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	
	@Column(name = "conversion_multiple")
	private BigDecimal conversionMultiple;
	private int port;
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeValue(String from, String to, Long id, BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}
	
	public ExchangeValue()
	{
		
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
}
