package creational_patterns.builder;

public abstract class SmartphoneBuilder {
  Smartphone smartphone;

  void createSmartphone() {
    smartphone = new Smartphone();
  }

  abstract void buildName();

  abstract void buildRam();

  abstract void buildDisplaySize();

  Smartphone getSmartphone() {
    return smartphone;
  }

}
