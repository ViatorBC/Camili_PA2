package Camili_p2;
import java.util.Scanner;

public class BMICalculator{
	
	// i made a bunch of variables over here for use 
	// Bheight,Bweight,BMI are all variables that are absolute
	
	// we have type and category for purposes of labeling and identifying 
	// which category you are and type is for identifying whether the measuring system is 
	// imperial or metric
	static float Bheight = 0;
	static float Bweight = 0;
	static float BMI = 0;
	static int Type = 0;
	static int category = 0;
	
	// so what im gonna do is have read user data display the initial prompt and get stuff going 
	public int readUserData(int data){
				
		// declaring variables
		int measurementData = 0;
		int height = 0, weight = 0;
		
		// hit up the function readUnitType
		readUnitType(measurementData);
		// Hit up the function readMeasurementData
		readMeasurementData(height, weight, measurementData);
		
		return data;
	}
	
	// this function reads in whether the measurements are metric or imperial
	private void readUnitType(int measurementData) {
		
		Scanner input = new Scanner(System.in);
		int x = 0;
		
		System.out.println("(Input the Number)Metric(0) or Imperial measurements(1): ");
		// as defined in the project description this would loop until you chose one 
		while(x == 0) {
			measurementData = input.nextInt();
			if(measurementData == 0 || measurementData == 1){
				x = 1;
			}
				
		}
	}
	
	// this reads in the data depending on whether its metric or imperial and chooses the right function
	private void readMeasurementData(int height, int weight, int measurementData){
		if(measurementData == 0) {
			Type = 0;
			readMetricData(height, weight);
		}
		if(measurementData == 1) {
			Type = 1;
			readImperialData(height, weight);
		}
	}
	
	// this function reads in the users input for the metric measurements
	private void readMetricData(int height, int weight){
		
		Scanner input = new Scanner(System.in);
		
		// enter the height
		System.out.println("Enter your Height(cm): ");
		height = input.nextInt();
				
		// Exit Condition
		if(height < 0){
			System.exit(0);
		}
		
		// enter the weight
		System.out.println("Enter your Weight(kg): ");
		weight = input.nextInt();
		
		
		// exit condition
		if(weight < 0){
			System.exit(0);
		}
		
		Bheight = height;
		Bweight = weight;
	}
	
	// this function reads in the users input if its imperial
	private void readImperialData(int height, int weight){
		
		Scanner input = new Scanner(System.in);
		
		// enter the height
		System.out.println("Enter your Height(in): ");
		height = input.nextInt();
		
		// Exit Condition
		if(height < 0){
			System.exit(0);
		}
		
		// enter the weight
		System.out.println("Enter your Weight(lb): ");
		weight = input.nextInt();
		
		// exit condition
		if(weight < 0){
			System.exit(0);
		}
		
		Bheight = height;
		Bweight = weight;
	}
	
	// MAAAAaaaaAAAATH
	public float calculateBMI(float data){
		
		if(Type == 0) {
			Bheight = Bheight / 100;
			data = ((Bweight) /(Bheight * Bheight));
			BMI = data;
		}
		
		if(Type == 1) {
			data = ((Bweight *703)/(Bheight * Bheight));
			BMI = data;
		}
			
		calculateBMICategory(data);
		
		return (int)data;
	}
	
	// define the categories by using some cool lookin if statements
	private void calculateBMICategory(float data){
		// under weight
		if(data < 18.5) {
			category = 1;
		}
		// normal weight
		else if(data >= 18.5 || data < 25.0) {
			category = 2;
		}
		// over weight
		else if(data >= 25.0 || data < 30.0) {
			category = 3;
		}
		// chonky boi
		else if(data >= 30) {
			category = 4;
		}
	}
	
	// displays ur shame, also uses different if statements to test out if "else if" mattered in this scenario
	public void displayBmi() {
		// under weight
		if(category == 1) {
			System.out.println("Your BMI is " + BMI);
			System.out.println("You are Under Weight");
		}
		// normal weight
		if(category == 2) {
			System.out.println("Your BMI is " + BMI);
			System.out.println("You are Normal Weight");
		}
		// over weight
		if(category == 3) {
			System.out.println("Your BMI is " + BMI);
			System.out.println("You are Over Weight");
		}
		// chonky boi
		if(category == 4) {
			System.out.println("Your BMI is " + BMI);
			System.out.println("You are Obese");
		}
	}
	
	// Ill be real I figured it would be better to not use these functions 
	// however i kept them in since in the instructions it didnt require any
	// other functions to use anything from these
	public int getWeight(int data) {
		return 0;
	}
	
	private int setWeight(int data) {
		return 0;
	}
	
	public int getHeight(int data) {
		return 0;
	}
	
	private int setHeight(int data) {
		return 0;
	}
	
	public int getBMI(int data) {
		return 0;
	}
	
	public int getBmiCategory(int data) {
		return 0;
	}
	
	// WAS NOT SURE IF I WAS SUPPOSED TO DELETE THIS AFTER TESTING 
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    int data = 0;
	    app.readUserData(data);
	    app.calculateBMI(data);
	    app.displayBmi();
	}
}