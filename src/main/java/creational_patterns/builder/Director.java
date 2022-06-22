package creational_patterns.builder;

public class Director {
  SmartphoneBuilder smartphoneBuilder;

  public void setSmartphoneBuilder(SmartphoneBuilder builder){
    smartphoneBuilder = builder;
  }

  Smartphone buildSmartphone(){
    smartphoneBuilder.createSmartphone();
    smartphoneBuilder.buildName();
    smartphoneBuilder.buildRam();
    smartphoneBuilder.buildDisplaySize();

    Smartphone smartphone = smartphoneBuilder.getSmartphone();
    return smartphone;
  }
}
