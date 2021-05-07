package in.atmsystem;

public class Deposit {
	public static void displayAcceptableDenominations() {
		System.out.println("Acceptable Denominations");

		String[] amount = { "100", "200", "500" };
		for (int i = 0; i < amount.length; i++) {
			System.out.print("Rs" + amount[i] + " ");
		}
	}

	public static double getDepositAmount(int depositAmount) {
		User availableBalance = new User();
		availableBalance.balance = 10000;
		
		System.out.println("\nDepositing Amount : " + depositAmount);
		if(depositAmount >= 1000) {
			availableBalance.balance = availableBalance.balance + depositAmount;
			System.out.println("Your Money has been successfully deposited");
		}
		else {
			System.out.println("Deposit more than 1000");
		}
		
		return availableBalance.balance;
	}

	private static void displayBalance(int balance) {
		// TODO Auto-generated method stub
		System.out.println("Current Balance : " + balance);

	}

	

}
