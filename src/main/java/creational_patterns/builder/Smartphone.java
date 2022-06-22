package creational_patterns.builder;

public class Smartphone {
  String name;
  int ram;
  int displaySize;

  public void setName(String name) {
    this.name = name;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setDisplaySize(int displaySize) {
    this.displaySize = displaySize;
  }

  @Override
  public String toString() {
    return "Smartphone{" +
            "name='" + name + '\'' +
            ", ram=" + ram +
            ", displaySize=" + displaySize +
            '}';
  }
}
