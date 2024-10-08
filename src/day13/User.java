package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
  private String username;
  List<User> subscriptions;

  public User(String username) {
    this.username = username;
    subscriptions = new ArrayList<>();
  }

  public String getUsername() {
    return username;
  }

  public List<User> getSubscriptions() {
    return subscriptions;
  }

  public void subscribe(User user) {
    if (!isSubscribed(user)) {
      subscriptions.add(user);
    } else {
      System.out.println("User already subscribed");
    }
  }

  public boolean isSubscribed(User user) {
    return subscriptions.contains(user);
  }

  public boolean isFriend(User user) {
    return (user.isSubscribed(this) && this.isSubscribed(user));
  }

  public void sendMessage(User user, String text) {
    MessageDatabase.sendMessage(this, user, text);
  }

  @Override
  public String toString() {
    return username;
  }
}
