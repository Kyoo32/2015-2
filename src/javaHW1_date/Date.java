package javaHW1_date;

import java.util.Scanner;

public class Date {
	
	private int year;
	private int month;
	private int day;
	Validate validation = new Validate();
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {	
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {	
		this.day = day;		
	}
	
	public void setDate(){
		
		Scanner user;
		Scanner scanner = user = new Scanner(System.in);
		int number;
		
		System.out.println("Enter your birthday");
		System.out.println("Year: ");
		
		do{
			number = user.nextInt();
		}while(!validation.validateYear(number) );
		
		this.setYear(number);
	
		System.out.println("Month: ");
		do{
			number = user.nextInt();
		}while(!validation.validateMonth(number));
		this.setMonth(number);
	
		System.out.println("Day: ");
		do{
			number = user.nextInt();
		}while(!validation.validateDay(this.getYear(), this.getMonth(), number));
		this.setDay(number);
		
	}
	
	public void showDate(){
		
		System.out.println("\nYour date is " + this.getYear() + "/" + this.getMonth() + "/" + this.getDay());
	}
	
	



}
	