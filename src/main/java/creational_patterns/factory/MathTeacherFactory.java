package creational_patterns.factory;

public class MathTeacherFactory implements TeacherFactory {
  @Override
  public Teachers createTeachers() {
    System.out.println("create Math teacher");
    return new MathTeacher();
  }
}
