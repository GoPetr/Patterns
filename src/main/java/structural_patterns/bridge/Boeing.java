package structural_patterns.bridge;

public class Boeing implements Plane {
  @Override
  public void toFly() {
    System.out.println("Boeing is flying");
  }
}
