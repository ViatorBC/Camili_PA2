package Camili_p1;

public class Encrypter{
	public static int encrypt( int value ){

		// declaring the first, second, third, and fourth values encrypting them
		//----------------------------------------------------------------------------------------------//
		// you get the first number by dividing the input by 1000 leaving the first digit				//
		int first = value / 1000;																		//
		// applying first part of the encryption 														//
		first = (first + 7) % 10;																		//
		//----------------------------------------------------------------------------------------------//
		// you get the second number by using the (value modulo 1000) leaving the second digit at the 	//
		// hundreds value so we divide it by 100														//
		int second = (value % 1000) / 100;																//
		// applying first part of the encryption														//
		second = (second + 7) % 10;																		//
		//----------------------------------------------------------------------------------------------//
		// third uses the same process as the second except we modulo by 100 and divide by 10			//
		int third = (value % 100) / 10;																	//
		// applying first part of the encryption														//
		third = (third + 7) % 10;																		//
		//----------------------------------------------------------------------------------------------//
		// the fourth we just modulo the value by 10 													//
		int fourth = value % 10; 																		//
		// applying first part of encryption 															//
		fourth = (fourth + 7) % 10;																		//
		//----------------------------------------------------------------------------------------------//
		int encryptedValue;																				//
		int temp; 																						//
		// swaps the values of first and third then second and fourth									//
		//----------------------------------------------------------------------------------------------//
		temp = first;																					//
		first = third;																					//
		third = temp;																					//
		//----------------------------------------------------------------------------------------------//
		temp = second; 																					//
		second = fourth;																				//
		fourth = temp;																					//
		//----------------------------------------------------------------------------------------------//
		// this finishes the encryption and reassembles the encrypted value								//
		encryptedValue = (first * 1000) + ((second) * 100) + (third * 10) + (fourth);					//
		//----------------------------------------------------------------------------------------------//
		// returns back encrypted value																	//
		return encryptedValue;																			//
		//----------------------------------------------------------------------------------------------//
	}
}