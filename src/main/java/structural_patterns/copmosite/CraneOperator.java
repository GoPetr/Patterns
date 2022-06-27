package structural_patterns.copmosite;

public class CraneOperator implements ConstructionTeam {
  @Override
  public void build() {
    System.out.println("I`m operator");
  }
}
