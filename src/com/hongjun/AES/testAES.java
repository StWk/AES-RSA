package com.hongjun.AES;

public class testAES {
	public static void main(String[] args)
	{
	    final String secretKey = "WsOdaddddddddddd";
	     
	    String originalString = "howtodoinjava.com";
	    
	    String encryptedString = algoAES.encrypt(originalString, secretKey);
	    String decryptedString = algoAES.decrypt(encryptedString, secretKey);
	     
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	}
}