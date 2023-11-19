package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User temp = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                temp = user;
                break;
            }
        }
        if (temp == null) {
            throw new UserNotFoundException("Item not found");
        }
        return temp;
    }

    public static boolean validate(User user) throws UserInvalidException {
        String username = user.getUsername();
        if (user.isValid() || username.length() < 3) {
            throw new UserInvalidException("This user has an access");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
            System.out.println("Item not found");
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            throw new RuntimeException(e);
        }
    }
}
