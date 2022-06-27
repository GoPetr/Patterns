package behavioral_patterns.chain;

public class DifficultReport extends BuildingNotify {

  public DifficultReport(int preparedness) {
    super(preparedness);
  }

  @Override
  public void write(String message) {
    System.out.println("Difficult level: " + message);
  }
}
