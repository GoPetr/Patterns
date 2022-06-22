package creational_patterns.builder;

public class SamsungSmartphoneBuilder extends SmartphoneBuilder {
  @Override
  void buildName() {
    smartphone.setName("Samsung");
  }

  @Override
  void buildRam() {
    smartphone.setRam(8);
  }

  @Override
  void buildDisplaySize() {
    smartphone.setDisplaySize(5);
  }
}
