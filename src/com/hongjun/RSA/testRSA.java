package com.hongjun.RSA;

public class testRSA {
	public static void main(String[] args) {
	    String originalString = "howtodoinjava.com";
	    
	    String encryptedString = algoRSA.encrypt(originalString);
	    String decryptedString = algoRSA.decrypt(encryptedString);
	    
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	}
}
