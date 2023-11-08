package thuan.com.solid;

public class UserValidator1 implements Validator {
	@Override
	public boolean isValid() {
		System.out.println("UserValidator1.isValid()");
		return true;
	}
}