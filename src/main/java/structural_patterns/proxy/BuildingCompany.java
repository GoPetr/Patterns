package structural_patterns.proxy;

public class BuildingCompany implements Build {
  String buildingLocation;

  public BuildingCompany(String buildingLocation) {
    this.buildingLocation = buildingLocation;
    projectDocumentation("Create project documentation");
  }

  public void projectDocumentation(String projectDocumentation) {
    System.out.println(projectDocumentation);
  }

  @Override
  public void startBuilding() {
    System.out.println("Start building");
  }
}
