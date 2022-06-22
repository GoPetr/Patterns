package creational_patterns.abstractFactory;

import creational_patterns.abstractFactory.buildingSchool.SchoolFactory;

public class SchoolBuildingProject {
  public static void main(String[] args) {
    BuildingCompanyFactory companyFactory = new SchoolFactory();
    Architect architect = companyFactory.getArchitect();
    BookKeeper bookKeeper = companyFactory.getBookKeeper();
    Engineer engineer = companyFactory.getEngineer();

    architect.makePlan();
    bookKeeper.count();
    engineer.build();
  }
}
