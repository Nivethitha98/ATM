package in.atmsystem;

import org.junit.Test;

public class NewPinTest {
@Test
public void test()
{
	Long number  = 9865353477L;
	int oldPassword = 1234;
	int newPassword = 4567;
	NewPin.pinChange(number, oldPassword, newPassword);
}
}
