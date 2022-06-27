package structural_patterns.bridge;

public class EuropeFlying extends FlyProtocol {

  protected EuropeFlying(Plane plane) {
    super(plane);
  }

  @Override
  public void getProtocol() {
    System.out.println("Europe flying is progress.");
    plane.toFly();
  }
}
