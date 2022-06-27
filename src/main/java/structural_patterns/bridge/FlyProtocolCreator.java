package structural_patterns.bridge;

public class FlyProtocolCreator {
  public static void main(String[] args) {

    FlyProtocol[] protocols = {
            new AmericanFlying(new Boeing()),
            new EuropeFlying(new Airbus())
    };

    for (FlyProtocol protocol : protocols){
      protocol.getProtocol();
    }
  }

}
