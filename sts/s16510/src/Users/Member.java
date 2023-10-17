package Users;

import java.util.ArrayList;

public class Member extends User{
    public Member(String id, String fullName, String emailAddress, int age, ArrayList<String> al) {
        super(id, fullName, emailAddress, age, al);
    }

    @Override
    public void setAccess_level(int access_level) {
        super.setAccess_level(3);
    }

    @Override
    public void setMaximumLimit(int maximumLimit) {
        super.setMaximumLimit(2);
    }
}
