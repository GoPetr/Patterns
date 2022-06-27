package behavioral_patterns.command;

public class StopCommand implements Command{
  Building building;

  public StopCommand(Building building){
    this.building = building;
  }

  @Override
  public void execute() {
    building.stopBuilding();
  }
}
