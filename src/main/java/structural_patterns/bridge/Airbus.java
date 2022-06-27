package structural_patterns.bridge;

public class Airbus implements Plane {
  @Override
  public void toFly() {
    System.out.println("Airbus is flying");
  }
}
