
package murach.data;

import murach.business.User;

public class UserDB {
    public static void insert(User user) {
        System.out.println("Saved user: " + user.getEmail()
                + " - " + user.getFirstName()
                + " " + user.getLastName());
    }
}
