package thuan.com.solid;

public class UserValidator2 implements Validator {
    @Override
    public boolean isValid() {
    	System.out.println("UserValidator2.isValid()");
        return false;
    }
}
