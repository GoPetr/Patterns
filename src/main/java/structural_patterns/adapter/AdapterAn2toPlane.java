package structural_patterns.adapter;

public class AdapterAn2toPlane extends An2 implements Plane {

  @Override
  public void toFly() {
    toFlyWithPropeller();
  }
}
