package hw2.car.paircoding.domain;

public class CarCompany {
	
	private static CarCompany hyundai = new CarCompany("hyundai");
	
	private CarInventory inventory = new CarInventory();
	
	private Accountant accountant = new Accountant();
	
	private String companyName;
	
	public Integer getTotalCarWorth() {
		return accountant.getTotalCarWorth(inventory);
	}	
	
	private CarCompany(String companyName){
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public static CarCompany getInstance() {
		
		if(hyundai == null) {
			hyundai = new CarCompany("hyundai");
		}
		return hyundai;
	}
}
