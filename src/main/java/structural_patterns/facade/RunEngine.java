package structural_patterns.facade;

public class RunEngine {
  public static void main(String[] args) {
    StartMotor startMotor = new StartMotor();
    startMotor.start();
  }
}
