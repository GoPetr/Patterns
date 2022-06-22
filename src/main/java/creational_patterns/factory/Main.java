package creational_patterns.factory;

public class Main {
  public static void main(String[] args) {
    TeacherFactory teacherFactory = createTeachersByLesson("math");
    Teachers teachers = teacherFactory.createTeachers();
    teachers.lesson();
  }

  static TeacherFactory createTeachersByLesson(String lesson) {
    if (lesson.equalsIgnoreCase("math")) {
      return new MathTeacherFactory();
    } else if (lesson.equalsIgnoreCase("geography")) {
      return new GeographyTeacherFactory();
    } else {
      throw new RuntimeException(lesson + "unknown lesson");
    }
  }
}
