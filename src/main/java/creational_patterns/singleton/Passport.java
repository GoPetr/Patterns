package creational_patterns.singleton;

public class Passport {
  private static Passport passport;

  private Passport() {
  }

  public static Passport getPassport() {
    if (passport == null) {
      passport = new Passport();
    }

    return passport;
  }
}
