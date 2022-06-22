package creational_patterns.abstractFactory.buildingSchool;

import creational_patterns.abstractFactory.Architect;
import creational_patterns.abstractFactory.BookKeeper;
import creational_patterns.abstractFactory.BuildingCompanyFactory;
import creational_patterns.abstractFactory.Engineer;

public class SchoolFactory implements BuildingCompanyFactory {

  @Override
  public Architect getArchitect() {
    return new SchoolArchitect();
  }

  @Override
  public BookKeeper getBookKeeper() {
    return new SchoolBookKeeper();
  }

  @Override
  public Engineer getEngineer() {
    return new SchoolEngineer();
  }
}
