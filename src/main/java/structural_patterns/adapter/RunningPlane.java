package structural_patterns.adapter;

public class RunningPlane {
  public static void main(String[] args) {
    Plane plane = new AdapterAn2toPlane();

    plane.toFly();
  }
}
