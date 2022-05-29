package com.example.apidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apidemo.dto.LoginResponseDTO;
import com.example.apidemo.dto.TransactionListParameters;
import com.example.apidemo.model.entity.Client;
import com.example.apidemo.dto.ClientRequest;
import com.example.apidemo.dto.LoginRequestDTO;

import java.util.Date;

import org.springframework.http.*;


@RequestMapping("/api") //endereco mapeado
@RestController

public class ApiController {
	
	@GetMapping("/hello/")
	public ResponseEntity<String>client() {
		try {
			return new ResponseEntity<>("Hello", HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>("Oh no", HttpStatus.BAD_GATEWAY);
		}
	}
	
	@PostMapping(value = "/merchant/user/login/",  consumes = {"application/json"})
	public ResponseEntity<LoginResponseDTO> login(@RequestBody final LoginRequestDTO params) {
		LoginResponseDTO resp = new LoginResponseDTO();
		return new ResponseEntity<>(resp,HttpStatus.OK);
	}
	
	@PostMapping("/client/")
	public Client client(@RequestBody final ClientRequest params) {
		Client resp = new Client();
		return resp;
	}

	@RequestMapping("/transaction/list")
	public TransactionListDTO list(@RequestBody final TransactionListParameters params) {
		TransactionListDTO resp = new TransactionListDTO();
		return resp;
	}
//
//	@PostMapping("/transaction/")
//	public TransactionData transaction(@RequestBody final TransactionRequest params) {
//		TransactionData resp = new TransactionData();
//		return resp;
//	}
//
//	@RequestMapping("/transactions/report")
//	public TransactionReport getTransactionReport(@RequestBody final TransactionReportParameters params) {
//		TransactionReport tr = new TransactionReport(new Date(2022, 0, 22), new Date(2022, 0, 22), new Long(0),
//				new Long(0));
//		return tr;
//	}


}
