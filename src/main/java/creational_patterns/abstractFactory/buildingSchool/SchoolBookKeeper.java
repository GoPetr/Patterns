package creational_patterns.abstractFactory.buildingSchool;

import creational_patterns.abstractFactory.BookKeeper;

public class SchoolBookKeeper implements BookKeeper {
  @Override
  public void count() {
    System.out.println("count estimate");
  }
}
