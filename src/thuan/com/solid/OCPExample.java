package thuan.com.solid;

public class OCPExample {
    public static void main(String[] args) {
        UserServiceV2 userService1 = new UserServiceV2(new UserValidator1());
        userService1.saveUser();
        UserServiceV2 userService2 = new UserServiceV2(new UserValidator2());
        userService2.saveUser(); 
    }
}
