package structural_patterns.proxy;

public class ProxyBuildingCompany implements Build {
  private String buildingLocation;
  private BuildingCompany buildingCompany;

  public ProxyBuildingCompany(String buildingLocation) {
    this.buildingLocation = buildingLocation;
  }

  @Override
  public void startBuilding() {
    if (buildingCompany == null) {
      buildingCompany = new BuildingCompany("Moscow");
    }
    buildingCompany.startBuilding();
  }
}
