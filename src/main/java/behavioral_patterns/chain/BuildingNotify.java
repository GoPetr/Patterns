package behavioral_patterns.chain;

public abstract class BuildingNotify {
  private int preparedness;
  private BuildingNotify nextModify;

  public BuildingNotify(int preparedness) {
    this.preparedness = preparedness;
  }

  public void setNextModify(BuildingNotify nextModify) {
    this.nextModify = nextModify;
  }

  public void notifyManager(String message, int level) {
    if (level <= preparedness) {
      write(message);
    }
    if (nextModify != null) {
      nextModify.notifyManager(message, level);
    }
  }

  public abstract void write(String message);
}
