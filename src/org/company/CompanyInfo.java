package org.company;

public class CompanyInfo {

	
	private void companyname() {
	 System.out.println("infosys");

}
	private void companyid() {
		System.out.println("58521");

	}
	private void companyaddress() {
		System.out.println("bangalore");

	}
	public static void main(String[] args) {
		
		CompanyInfo c = new CompanyInfo();
		c.companyaddress();
		c.companyid();
		c.companyname();
	}
}
