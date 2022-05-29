package com.example.apidemo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Transaction {
	FxInformation fx;
	Customer​ customerInfo;
	Merchant merchant;
	Transaction transaction;
	AcquirerInfo acquirer;
	Boolean refundable;

}
