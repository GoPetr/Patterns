package behavioral_patterns.chain;

public class VeryHardReport extends BuildingNotify {

  public VeryHardReport(int preparedness) {
    super(preparedness);
  }

  @Override
  public void write(String message) {
    System.out.println("Very Hard level: " + message);
  }
}
