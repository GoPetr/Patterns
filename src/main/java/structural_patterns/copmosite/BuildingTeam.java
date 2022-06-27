package structural_patterns.copmosite;

import java.util.ArrayList;
import java.util.List;

public class BuildingTeam {
  private List<ConstructionTeam> constructionTeams = new ArrayList<>();

  public void addTeam(ConstructionTeam constructionTeam) {
    constructionTeams.add(constructionTeam);
  }

  public void startBuilding() {
    System.out.println("Start building");
    for(ConstructionTeam team : constructionTeams){
      team.build();
    }
  }
}
