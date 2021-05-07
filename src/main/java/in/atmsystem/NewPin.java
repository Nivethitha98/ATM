package in.atmsystem;

import java.util.HashMap;
public class NewPin {
	static HashMap<Long, Integer> pin = new HashMap<Long,Integer>();	
	/**
	 * This HashMap is for storing mobile Number and generated new pin
	 */
	static {
		
		pin.put(9865353477L, 1234);
		pin.put(8523565434L, 1576);
		pin.put(9564321234L, 2050);
		pin.put(9076213456L, 8899);
		
	}
	
	public static void pinChange(Long number, int oldPassword, int newPassword) {
		pin.replace(number, oldPassword, newPassword);
		System.out.println("The pin changed for the account "+number +"from "+oldPassword +" is "+pin.get(9865353477L));
		System.out.println("account "+number+"-->"+pin.get(number));
	}

	

}
