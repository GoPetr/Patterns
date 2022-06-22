package creational_patterns.factory;

public class GeographyTeacherFactory implements TeacherFactory {
  @Override
  public Teachers createTeachers() {
    System.out.println("create Geography teacher");
    return new GeographyTeacher();
  }
}
