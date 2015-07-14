package javaHW2_car;

public class Main {
	
	public static void main(String[] args){
		
		CarCompany cc = new CarCompany();
		Calculation account = new Calculation();
		
		cc.setArrayListItem(new Sonata());
		cc.setArrayListItem(new Genesis());
		cc.setArrayListItem(new Granger());
		
		System.out.println("The company's total worth is "+ account.calCompanyGoodsWorth(cc.carInStock));
	}
	
}
