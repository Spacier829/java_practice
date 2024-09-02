package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
  public int getYear() {
    return year;
  }

  private int year;
  private String name;
  private List<MusicArtist> members;

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

  public void addMember(MusicArtist artist) {
    members.add(artist);
  }

  public void removeMember(MusicArtist artist) {
    members.remove(artist);
  }

  public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
    for (MusicArtist member : musicBand1.members) {
      musicBand2.addMember(member);
    }
    musicBand1.members.clear();
  }
}
