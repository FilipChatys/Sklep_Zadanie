package Zad12Sklep;
import java.util.HashMap;
import java.util.Scanner;
    public class ListOfUsers {
        private static HashMap<String, User> users;

        public ListOfUsers() {
            users = new HashMap<>();
        }

        public void addUser(User user) {
            users.put(user.getLogin(), user);
        }

        public static User getUser(String username) {
            return users.get(username);
        }



    }


