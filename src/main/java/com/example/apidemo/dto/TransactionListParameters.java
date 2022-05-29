package com.example.apidemo.dto;

import java.util.Calendar;

import com.example.apidemo.model.entity.ApiStatus;
import com.example.apidemo.model.entity.ErrorCode;
import com.example.apidemo.model.entity.FilterField;
import com.example.apidemo.model.entity.Operation;
import com.example.apidemo.model.entity.PaymentMethod;

public class TransactionListParameters {
	Calendar fromDate; 
	Calendar toDate;
	ApiStatus status;
	Operation requestOperation;
	int merchantId;
	int acquirerId;
	PaymentMethod paymentMethod;
	ErrorCode errorCode;
	FilterField filterField; 
	String filterValu;
	int page;
}
