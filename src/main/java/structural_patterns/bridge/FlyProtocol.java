package structural_patterns.bridge;

public abstract class FlyProtocol {
  protected Plane plane;

  protected FlyProtocol(Plane plane) {
    this.plane = plane;
  }

  public abstract void getProtocol();
}
