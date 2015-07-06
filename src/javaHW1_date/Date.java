package javaHW1_date;

import java.util.Scanner;

public class Date {
	
	private int year;
	private int month;
	private int day;
	int check = -1;
	boolean isValid = true;
	
	public int getYear() {
		return year;
	}
	public int setYear(int year) {
		if(year>0){
			this.year = year;
			return 1;
		}
		else{
			System.out.println("Year is off scope, enter another again!");
			return -1;
		}
	}

	public int getMonth() {
		return month;
	}
	public int setMonth(int month) {
		if(month>0 &&month<13){
			this.month = month;
			return 1;
		}
		else{
			System.out.println("Month is off scope, enter another again!");
			return -1;
		}
	}
	
	public int getDay() {
		return day;
	}
	public int setDay(int day) {
		if(day<1||day>31){
			System.out.println("Day is off scope, enter another again!");
			return -1;
		}
		
		switch(this.getMonth()){
			case 2:
				if(day>29)
					break;
				else if (day==29){
					if(this.getYear()%400==0 ||(this.getYear()%4==0&&this.getYear()%100 !=0)){
						this.day = day;
						return 1;
					}
					break;
				}
				else {
					this.day = day;
					return 1;
				}
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:	
				this.day = day;
				return 1;
			case 4: case 6: case 9: case 11:
				if(day==31)
					break;
				this.day = day;
				return 1;		
		}	
		System.out.println("Day is off scope, enter another again!");
		return -1;
	}
	
	public void setDate(){
		
		Scanner user;
		Scanner scanner = user = new Scanner(System.in);
		
		System.out.println("Enter your birthday");
		System.out.println("Year: ");
		while(check<0) {
			int userYear = user.nextInt();
			check = this.setYear(userYear);
		}
	
		System.out.println("Month: ");
		check = -1;
		while(check<0){
			int userMonth = user.nextInt();
			check = this.setMonth(userMonth);
		}
	
		System.out.println("Day: ");
		check = -1;
		while(check<0){
			
			int userDay = user.nextInt();
			check = this.setDay(userDay);
		}
	}
	
	public void showDate(){
		
		System.out.println("\nYour date is " + this.getYear() + "/" + this.getMonth() + "/" + this.getDay());
	}
	
	



}
	