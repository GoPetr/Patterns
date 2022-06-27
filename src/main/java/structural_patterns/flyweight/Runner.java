package structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    SmartphoneFactory factory = new SmartphoneFactory();

    List<Smartphone> smartphones = new ArrayList<>();

    smartphones.add(factory.getSmartphonesByName("samsung"));
    smartphones.add(factory.getSmartphonesByName("samsung"));
    smartphones.add(factory.getSmartphonesByName("samsung"));
    smartphones.add(factory.getSmartphonesByName("apple"));
    smartphones.add(factory.getSmartphonesByName("apple"));
    smartphones.add(factory.getSmartphonesByName("apple"));

    for(Smartphone smartphone : smartphones){
    smartphone.getName();
    }
  }
}
