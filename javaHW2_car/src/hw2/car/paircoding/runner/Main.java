package hw2.car.paircoding.runner;

import hw2.car.paircoding.domain.CarCompany;

public class Main {

	public static void main(String[] args) {
	
		CarCompany cc = CarCompany.getInstance();
		
		System.out.println(cc.getCompanyName() +" 회사가 소유하고 있는 차의 총 자산은 " + cc.getTotalCarWorth() + " 입니다.");
	}
}
