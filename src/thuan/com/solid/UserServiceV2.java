package thuan.com.solid;

class UserServiceV2 {
    private Validator validator;
 
    public UserServiceV2(Validator validator) {
        this.validator = validator;
    }
 
    public void saveUser() {
        if (this.validator.isValid()) {
            // Do save
        } else {
            // Show error
        }
    }
}