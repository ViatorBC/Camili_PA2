package Camili_p1;

import java.util.Scanner;

public class Application{
	
	public static void main(String[] args){
		// declaring value, and making a scanner
		int value; 
		Scanner input = new Scanner(System.in);
		
		// scanning in the 4 digit number to value
		System.out.println("Enter a 4 digit number: ");
		value = input.nextInt(); 	
		
		//print out that good stuff referencing the values in 
		// encrypter and decrypter respectively 
		System.out.println("Encrypted Value:" + Encrypter.encrypt(value));
		System.out.println("Decrypted Value:" + Decrypter.decrypt(value));
		
		// NOTE // 
		// i gave up stylizing the code after the encrypter and decrypter function since im already 
		// running late on this assignment. Thanks for grading this late and I apologize for inconveniencing you
		
	}
}