package com.componentprocessing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// capturing the payment details 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {
	private  Long cardNumber;
	private  int cvv;
	private  double amount;
	
	

}
