package creational_patterns.factory;

public class MathTeacher implements Teachers {
  @Override
  public void lesson() {
    System.out.println("Math");
  }
}
