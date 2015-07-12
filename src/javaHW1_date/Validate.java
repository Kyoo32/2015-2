package javaHW1_date;

public class Validate {
	
	boolean validateYear(int number){
		if(number>0){		
			return true;
		}
		else{
			System.out.println("Year is off scope, enter another again!");
			return false;
		}
	}
	
	boolean validateMonth(int number){
		if(number>0 &&number<13){	
			return true;
		}
		else{
			System.out.println("Month is off scope, enter another again!");
			return false;
		}	
	}
	
	boolean validateDay(int year, int month, int number){
		if(number<1||number>31){
			System.out.println("number is off scope, enter another again!");
			return false;
		}
		switch(month){
			case 2:
				if(number>29)
					break;
				else if (number==29){
					if(year%400==0 ||(year%4==0&&year%100 !=0)){
						return true;
					}
					break;
				}
				else {
					return true;
				}
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:	
				return true;
			case 4: case 6: case 9: case 11:
				if(number==31)
					break;
				return true;		
		}	
		System.out.println("day is off scope, enter another again!");
		return false;
	}
	
	
}
