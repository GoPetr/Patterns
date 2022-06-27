package behavioral_patterns.chain;

public class LevelChanger {
  public static void main(String[] args) {
    BuildingNotify notifyLvl1 = new SimpleReport(Preparedness.LEVEL1);
    BuildingNotify notifyLvl2 = new DifficultReport(Preparedness.LEVEL2);
    BuildingNotify notifyLvl3 = new VeryHardReport(Preparedness.LEVEL3);

    notifyLvl1.setNextModify(notifyLvl2);
    notifyLvl2.setNextModify(notifyLvl3);

    notifyLvl1.notifyManager("Everything is OK", Preparedness.LEVEL1);
    notifyLvl1.notifyManager("Something went wrong", Preparedness.LEVEL2);

  }
}
