package com.alirza.microservices.currencyexchangeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alirza.microservices.currencyexchangeservices.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByfromAndTo(String from, String to);
}
