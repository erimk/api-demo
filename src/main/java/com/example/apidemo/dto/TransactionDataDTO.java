package com.example.apidemo.dto;

import com.example.apidemo.model.entity.AcquirerInfo;
import com.example.apidemo.model.entity.Customer​;
import com.example.apidemo.model.entity.FxInformation;
import com.example.apidemo.model.entity.Merchant;
import com.example.apidemo.model.entity.Transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class TransactionDataDTO {
	
	FxInformation fx;
	Customer​ customerInfo;
	Merchant merchant;
	Transaction transaction;
	AcquirerInfo acquirer;
	Boolean refundable;

}
