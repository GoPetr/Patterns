package creational_patterns.abstractFactory.buildingSchool;

import creational_patterns.abstractFactory.Engineer;

public class SchoolEngineer implements Engineer {
  @Override
  public void build() {
    System.out.println("building");
  }
}
