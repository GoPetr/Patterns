package behavioral_patterns.command;

public class BuildingRunner {
  public static void main(String[] args) {
    Building building = new Building();

    Builder builder = new Builder(new StartCommand(building), new StopCommand(building));

    builder.startMethod();
    builder.stopMethod();
  }
}
