package structural_patterns.proxy;

public class BuildingRunner {
  public static void main(String[] args) {
    Build build = new ProxyBuildingCompany("Moscow");
    build.startBuilding();
  }

}
