package structural_patterns.facade;

public class Engine {
  public void runEngine(KeyIgnition keyIgnition) {
    if (keyIgnition.isTurnOnKeyIgnition()) {
      System.out.println("The engine is running");
    } else {
      System.out.println("The engine is not running");
    }
  }
}
