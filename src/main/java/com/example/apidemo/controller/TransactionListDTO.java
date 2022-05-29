package com.example.apidemo.controller;

import java.util.List;

import com.example.apidemo.model.entity.Transaction;

public class TransactionListDTO {

	int per_page;
	int current_page;
	String next_page_url ;
	String prev_page_url;
	int from;
	int to;
	List<Transaction> data;

}
