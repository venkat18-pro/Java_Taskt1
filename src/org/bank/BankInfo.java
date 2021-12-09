package org.bank;

public class BankInfo extends AxisBank{
	
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("Saving");
	}
	
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("Fixed");
	}
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit from Bank");
	}
	
	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}
}
