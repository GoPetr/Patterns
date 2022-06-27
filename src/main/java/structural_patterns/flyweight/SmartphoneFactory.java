package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SmartphoneFactory {
  private static final Map<String, Smartphone> smartphones = new HashMap<>();

  public Smartphone getSmartphonesByName(String name) {
    Smartphone smartphone = smartphones.get(name);

    if (smartphone == null) {
      switch (name) {
        case "samsung" -> {
          System.out.println("This is samsung");
          smartphone = new Samsung();
        }
        case "apple" -> {
          System.out.println("This is apple");
          smartphone = new Apple();
        }
      }
      smartphones.put(name, smartphone);
    }
    return smartphone;
  }
}
