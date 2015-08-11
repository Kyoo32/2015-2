package object;

class MyDate {
	
	
	int year;
	int month;
	int day;
	
	MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int hashCode() {
		
		return (day^month^year);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate){
			MyDate date = (MyDate)obj;
			if(this.day == date.day &&this.month == date.month && this.year == date.year)
				return true;
			else return false;	
		}
		return false;
	}
	
	
	
}


public class MyDateTest {
	
	
	public static void main(String[] args){
	
		MyDate m1 = new MyDate(31, 7, 2015);
		MyDate m2 = new MyDate(31, 7, 2015);
		
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());

	}
	
	
}
