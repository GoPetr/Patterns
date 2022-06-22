package creational_patterns.abstractFactory;

public interface BuildingCompanyFactory {
  Architect getArchitect();

  BookKeeper getBookKeeper();

  Engineer getEngineer();
}
