package lecture.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lecture.shipping.Company;

public class CompanyTest {

	@Test
	public void test() {
		Company c0 = new Company();
		Company c1 = new Company();
		
		assertEquals(c0, c1);

	}

}
