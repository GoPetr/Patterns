package behavioral_patterns.chain;

public class SimpleReport extends BuildingNotify {

  public SimpleReport(int preparedness) {
    super(preparedness);
  }

  @Override
  public void write(String message) {
    System.out.println("Simple level: " + message);
  }
}
