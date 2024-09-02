package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
  public int getYear() {
    return year;
  }

  private int year;
  private String name;
  private List<String> members;

  public MusicBand(int year, String name) {
    this.year = year;
    this.name = name;
    this.members = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "MusicBand{" +
           "year=" + year +
           ", name=" + name +
           "}";
  }

  public void addMember(String member) {
    members.add(member);
  }

  public void removeMember(String member) {
    int index = member.indexOf(member);
    if (index != -1){
      members.remove(index);
    } else {
      System.out.println("Member not found");
    }
  }

  public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
    for (String member : musicBand1.members) {
      musicBand2.addMember(member);
    }
    musicBand1.members.clear();
  }
}
