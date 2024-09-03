package day13;

public class Test {
  public static void main(String[] args) {
    Task1.main(args);
  }
}

class Task1 {
  public static void main(String[] args) {
    User u1 = new User("user1");
    User u2 = new User("user2");
    User u3 = new User("user3");

    u1.sendMessage(u2, "Test 1-2_1");
    u2.sendMessage(u1, "Test 2-1_1");
    u1.sendMessage(u2, "Test 1-2_2");
    u2.sendMessage(u1, "Test 2-1_2");
    u2.sendMessage(u1, "Test 2-1_3");

    u3.sendMessage(u1, "Test 3-1_1");
    u3.sendMessage(u1, "Test 3-1_2");
    u1.sendMessage(u3, "Test 1-3_1");
    u3.sendMessage(u1, "Test 3-1_3");
    u1.sendMessage(u3, "Test 1-3_2");
    u1.sendMessage(u3, "Test 1-3_3");
    u2.sendMessage(u3, "Test 2-3_1");
    u2.sendMessage(u3, "Test 2-3_2");
    u3.sendMessage(u2, "Test 3-2_1");

    MessageDatabase.showDialog(u2, u3);
  }
}
