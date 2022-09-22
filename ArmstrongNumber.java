package com.interviews;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int a = 370;
		//change changed
		int temp = a;
		
		int digit1, digit2, digit3;
		digit1=a%10;
		a = a/10;
		digit2 = a%10;
		a = a/10;
		digit3 = a%10;
		
		if(digit1*digit1*digit1+digit2*digit2*digit2+digit3*digit3*digit3 == temp) {
			System.out.println(temp+" is Armstrong number");
		}else {
			System.out.println(temp+" is Not Armstrong Number");
		}
		
	}
	
}
