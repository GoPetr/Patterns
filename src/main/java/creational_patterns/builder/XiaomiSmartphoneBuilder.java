package creational_patterns.builder;

public class XiaomiSmartphoneBuilder extends SmartphoneBuilder {

  @Override
  void buildName() {
    smartphone.setName("Xiaomi");
  }

  @Override
  void buildRam() {
    smartphone.setRam(8);
  }

  @Override
  void buildDisplaySize() {
    smartphone.setDisplaySize(6);
  }
}
