package in.atmsystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWithdraw {
	@Test
	public void checkDenominations()
	{
	Withdraw.displayAvailableDenominations() ;
	System.out.println("----------------------------------------------------------------------------------");
	}
	
	@Test
	public void toCkechWithdrawAmount1()
	{
	int withdrawAmount = 10000;
	double balance =  Withdraw.getWithdrawAmount(withdrawAmount);
	System.out.println("Available Balance "+balance);
	assertEquals(5000,balance ,0.001);
	System.out.println("----------------------------------------------------------------------------------");
	}
	@Test
	public void toCkechWithdrawAmount2()
	{
	int withdrawAmount = 3260;
	double balance =  Withdraw.getWithdrawAmount(withdrawAmount);
	System.out.println("Available Balance "+balance);
	assertEquals(2000,balance, 0.001 );
	System.out.println("----------------------------------------------------------------------------------");
	
	}
//	@Test
//	public void checkBalance()
//	{
//	Withdraw.displayBalance(500);
//}

}