package behavioral_patterns.command;

public class StartCommand implements Command {
  Building building;

  public StartCommand(Building building) {
    this.building = building;
  }

  @Override
  public void execute() {
    building.startBuilding();
  }
}
