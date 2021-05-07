package in.atmsystem;

public class Withdraw {
	/**
	 * This method is for displaying available denominations
	 */
	public static void displayAvailableDenominations() {
		System.out.println("Available Denominations");

		String[] amount = { "100", "200", "500" };
		for (int i = 0; i < amount.length; i++) {
			System.out.print("Rs" + amount[i] + " ");
		}
	}

	/**
	 * This method is for withdraw amount If balance amount is greater than withdraw amount means it will display the message as insufficient fund otherwise it
	 * will display as transaction is processing
	 * @param withdrawAmount
	 * @return
	 */
	public static double getWithdrawAmount(int withdrawAmount) {
		User balance = new User();
		//double availabeBalance  = balance.balance;
		balance.balance = 5000;
		System.out.println("\nWithdrawing Amount : " + withdrawAmount);
		if((withdrawAmount >= 100)) {
			if ( withdrawAmount < balance.balance) {
				balance.balance = balance.balance - withdrawAmount;
				System.out.println("Your Transaction is processing....\nPlease collect your amount");			
			} 
			else {
				System.out.println("Sorry! Insufficient Fund");
			}
		
		}
		else {
			System.out.println("Sorry invalid amount");
		}
		return balance.balance ;
	}
	/**
	 * This method is for displaying updated new balance
	 * @param balance
	 */
	public static void displayBalance(int balance) {
		
		System.out.println("Current Balance : " + balance);
	}
	
	
	


}
