package creational_patterns.abstractFactory.buildingSchool;

import creational_patterns.abstractFactory.Architect;

public class SchoolArchitect implements Architect {

  @Override
  public void makePlan() {
    System.out.println("create plan");
  }
}
