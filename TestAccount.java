package com.staticConcept;

public class TestAccount {
	
	public static void main(String[] args) {
  
   Account a1 = new Account(1,1000);
   Account a2 = new Account(2,2000);
   
 
   System.out.println(a1.acountno);
   System.out.println(a1.balance);
   System.out.println(Account.bankname);
   
   System.out.println(a2.acountno);
   System.out.println(a2.balance);
   System.out.println(Account.bankname);
   
   Account.bankname="State Bank of India";
   System.out.println(Account.bankname);
	}
}
