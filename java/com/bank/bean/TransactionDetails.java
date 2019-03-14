package com.bank.bean;

public class TransactionDetails {
   private int fromAccountNo;
   private int toAccountNo; 
   private int amountTransferred;
public int getFromAccountNo() {
	return fromAccountNo;
}
public void setFromAccountNo(int fromAccountNo) {
	this.fromAccountNo = fromAccountNo;
}
public int getToAccountNo() {
	return toAccountNo;
}
public void setToAccountNo(int toAccountNo) {
	this.toAccountNo = toAccountNo;
}
public int getAmountTransferred() {
	return amountTransferred;
}
public void setAmountTransferred(int amountTransferred) {
	this.amountTransferred = amountTransferred;
}
   
}
