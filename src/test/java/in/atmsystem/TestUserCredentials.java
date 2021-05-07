package in.atmsystem;

import org.junit.Test;

public class TestUserCredentials {
	@Test
	public void withValidPinAndAccountNumber()
	{
		UserCredentials.isExist(59764346789L,1234);
	}

	@Test
	public void withValidPinAndInvalidAccountNumber()
	{
		UserCredentials.isExist(86876543L,1234);
	}
	@Test
	public void withInvalidPinValidAccountNumber()
	{
		UserCredentials.isExist(59764346789L,9765);
	}
}
