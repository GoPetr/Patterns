package structural_patterns.copmosite;

public class Building {
  public static void main(String[] args) {
    BuildingTeam buildingTeam = new BuildingTeam();

    ConstructionTeam constructionTeam = new CraneOperator();
    ConstructionTeam constructionTeam1 = new Stacker();

    buildingTeam.addTeam(constructionTeam);
    buildingTeam.addTeam(constructionTeam1);

    buildingTeam.startBuilding();
  }
}
