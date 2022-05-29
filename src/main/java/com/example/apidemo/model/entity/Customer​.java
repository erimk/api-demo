package com.example.apidemo.model.entity;

import java.util.Calendar;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Customer​ {
	Long id;// ​ " ​ : ​ ​ 1 ​ ,
	Date created_at;// 2015-10-09​ ​ 12:09:10"​ ,
	Date updated_at;// ​ " ​ : ​ "2015-10-09​ ​ 12:09:10"​ ,
	Date deleted_at​;// " ​ : ​ ​ null,
	Long number​;// " ​ : ​ ​ "401288XXXXXX1881"​ ,
	int expiryMonth;// ​ " ​ : ​ ​ "6"​ ,
	int expiryYear;// ​ " ​ : ​ "2017"​ ,
	int startMonth​;// " ​ : ​ ​ null,
	//int startYear;​//
	//int issueNumber;​// " ​ : ​ ​ null,
	String email;// ​ " ​ : ​ ​ "michael@gmail.com"​ ,
	Calendar birthday;// ​ " ​ : ​ ​ "1986-03-20​ ​ 12:09:10"​ ,
	char gender;// ​// " ​ : ​ ​ null,
	String billingTitle;// ​ " : ​ ​ null,
	String billingFirstName;// "Michael" ,
	String billingLastName;// "Kara" ,
	String billingCompany;// null,
	String billingAddress1;// "test address" ,
	String billingAddress2;// null,
	String billingCity;// "Antalya" ,
	String billingPostcode;// "07070" ,
	String billingState;// null,
	String billingCountry;// " : " TR" ,
	String billingPhone;// null,
	String billingFax;// null,
	String shippingTitle;// null,
	String shippingFirstName;// "Michael" ,
	String shippingLastName;// "Kara" ,
	String shippingCompany;// null,
	String shippingAddress1;// "test address" ,
	String shippingAddress2;// null,
	String shippingCity;// "Antalya" ,
	String shippingPostcode;// "07070" ,
	String shippingState;// null,
	String shippingCountry;// "TR" ,
	String shippingPhone;// null,
	String shippingFax;// null

}
