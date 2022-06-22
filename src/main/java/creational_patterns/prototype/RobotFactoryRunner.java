package creational_patterns.prototype;

public class RobotFactoryRunner {

  public static void main(String[] args) {
    Robot robot = new Robot("Nikolay", "T354");

    RobotCloneFactory copyFactory = new RobotCloneFactory(robot);
    Robot robot1 = copyFactory.cloneRobot();

    System.out.println(robot);
    System.out.println(robot1);
  }
}
