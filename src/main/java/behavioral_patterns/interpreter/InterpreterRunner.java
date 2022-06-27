package behavioral_patterns.interpreter;

public class InterpreterRunner {
  public static void main(String[] args) {
    Expression isBuilder = getBuildingCompetence();
    Expression isProBuilder = getProBuildingCompetence();

    System.out.println("Is builder? " + isBuilder.interpret("builder"));
    System.out.println("Is pro builder? " + isBuilder.interpret("pro"));

  }

  public static Expression getBuildingCompetence() {
    Expression build = new TerminalExpression("build");
    Expression middleBuild = new TerminalExpression("middle build");

    return new OrExpression(build, middleBuild);
  }

  public static Expression getProBuildingCompetence() {
    Expression build = new TerminalExpression("build");
    Expression proBuilder = new TerminalExpression("pro builder");

    return new AndExpression(build, proBuilder);
  }

}
