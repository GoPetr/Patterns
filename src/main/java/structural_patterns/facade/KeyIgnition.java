package structural_patterns.facade;

public class KeyIgnition {
  private boolean keyIgnition;

  public boolean isTurnOnKeyIgnition() {
    return keyIgnition;
  }

  public void startIgnition() {
    keyIgnition = true;
  }

  public void finishIgnition() {
    keyIgnition = false;
  }
}
