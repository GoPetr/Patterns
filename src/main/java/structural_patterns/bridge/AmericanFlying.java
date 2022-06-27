package structural_patterns.bridge;

public class AmericanFlying extends FlyProtocol {

  protected AmericanFlying(Plane plane) {
    super(plane);
  }

  @Override
  public void getProtocol() {
    System.out.println("American flying is progress.");
    plane.toFly();
  }
}
