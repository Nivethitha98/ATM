package in.atmsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDeposit {
	@Test
	public void checkAcceptableDenominations()
	{
	Deposit.displayAcceptableDenominations() ;
	System.out.println("----------------------------------------------------------------------------------");
	
	}
	
	
	@Test
	public void getDepositAmountTest1() //adding 1000 to deposit 
	{
		int depositAmount = 1000;
		double balance =  Deposit.getDepositAmount(depositAmount);
		System.out.println("Available Balance "+balance);
		assertEquals(11000,balance ,0.001);
		System.out.println("----------------------------------------------------------------------------------");
		
		
	}
	@Test
	public void getDepositAmountTest2() //adding 600 but the required amount is 1000
	{
		int depositAmount = 600;
		double balance =  Deposit.getDepositAmount(depositAmount);
		System.out.println("Available Balance "+balance);
		assertEquals(10000,balance ,0.001);
		System.out.println("----------------------------------------------------------------------------------");
		
		
	}

}
