package in.atmsystem;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashMap;

public class UserCredentials {

	/**
	 * This ArrayList is for adding user details
	 *  User is a User-defined data type
	 * Here userDetails is the object
	 */
	//public static ArrayList<User> userDetails = new ArrayList<User>();
	public static HashMap<Long, Integer> masterCredentials = new HashMap<Long, Integer>();
	
	static {
		User user1 = new User();
		user1.accountNumber = 59764346789L;
		user1.pin = 1234;
		//user1.balance = 5000;
		masterCredentials.put(user1.accountNumber,user1.pin);
		User user2 = new User();
		user2.accountNumber = 87676453345L;
		user2.pin = 8899;
		user2.balance = 4000;
		masterCredentials.put(user2.accountNumber,user2.pin);
		
	//	userDetails.add(user1);
	//	userDetails.add(user2);
		//System.out.println(userDetails.get(0).accountNumber);
		//userMap.put()
	}

	/**
	 * display method is used to display the user details through the for each loop
	 */
	public static void display() {
		// Display all user details
		for (Long user : masterCredentials.keySet()) {
			System.out.println(user);
		}
	}

	/**
	 * Here we check the AccountNumber and Pin Number
	 * @param accountnumber
	 * @param pin
	 * @return
	 */
	public static boolean isExist(Long accountnumber, int pin) {
		boolean exists = false;
//		
		
		if(masterCredentials.containsKey(accountnumber)){
			if(masterCredentials.get(accountnumber)==pin) {
				System.out.println("Success");
				exists= true;
			}
			else {
				System.out.println("invalid pin");
				exists= false;
			}
		}
		else {
			System.out.println("Account not found");
			exists = false;
		}
		return exists;
		
	}

	/**
	 * This method is for checking card validity
	 * 
	 * @param date
	 */

	public static void cardValidity(String date) {
		YearMonth cardExpiryDate = YearMonth.parse(date);
		YearMonth now = YearMonth.now();
		if (cardExpiryDate.isBefore(now)) {
			System.out.print("Your Card has Expired");
		}
	}

	public static void main(String[] args) {
		// isExistUser();
		cardValidity("2027-04");
		display();
		Long accountNo = 59764346789L;
		int pin = 1234;
		isExist(accountNo, pin);
		
		Long accountNo1 = 5976434678L;
		int pin1 = 1234;
		isExist(accountNo1, pin1);
		
		Long accountNo2 = 59764346789L;
		int pin2 = 1232;
		isExist(accountNo2, pin2);
	}
}
