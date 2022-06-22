package creational_patterns.prototype;

public class RobotCloneFactory {
  Robot robot;

  public RobotCloneFactory(Robot robot){
    this.robot = robot;
  }

  public void setRobot(Robot robot){
    this.robot = robot;
  }

  Robot cloneRobot(){
    return (Robot) robot.copy();
  }
}
