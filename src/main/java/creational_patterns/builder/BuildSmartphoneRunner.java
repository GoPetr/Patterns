package creational_patterns.builder;

public class BuildSmartphoneRunner {
  public static void main(String[] args) {
    Director director = new Director();

    director.setSmartphoneBuilder(new SamsungSmartphoneBuilder());
    Smartphone smartphone = director.buildSmartphone();

    System.out.println(smartphone);
  }
}
