package creational_patterns.prototype;

public class Robot implements Copyable {
  String name;
  String serial;

  public Robot(String name, String serial) {
    this.name = name;
    this.serial = serial;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  @Override
  public Object copy() {
    Robot copy = new Robot(name, serial);
    return copy;
  }

  @Override
  public String toString() {
    return "Robot{" +
            "name='" + name + '\'' +
            ", Serial='" + serial + '\'' +
            '}';
  }
}
