package structural_patterns.decorator;

public class MacBook2022 extends NoteBookDecorator{
  MacBook2022(Notebook notebook) {
    super(notebook);
  }

  public String runGames(){
    return "run games ";
  }

  @Override
  public String runCalculate() {
    return super.runCalculate() + runGames();
  }
}
