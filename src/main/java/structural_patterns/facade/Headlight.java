package structural_patterns.facade;

public class Headlight {
  public void isHeadlightOn(KeyIgnition keyIgnition) {
    if (keyIgnition.isTurnOnKeyIgnition()) {
      System.out.println("The headlight is on");
    } else {
      System.out.println("The headlight is off");
    }
  }
}
