package structural_patterns.facade;

public class StartMotor {
  KeyIgnition keyIgnition = new KeyIgnition();
  Engine engine = new Engine();
  Headlight headlight = new Headlight();

  public void start() {
    keyIgnition.startIgnition();
    engine.runEngine(keyIgnition);
    headlight.isHeadlightOn(keyIgnition);
  }
}
