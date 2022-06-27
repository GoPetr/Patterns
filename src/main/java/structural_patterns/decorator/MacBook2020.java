package structural_patterns.decorator;

public class MacBook2020 extends NoteBookDecorator{

  MacBook2020(Notebook notebook) {
    super(notebook);
  }

  String runPresentation(){
    return "run presentation ";
  }

  @Override
  public String runCalculate() {
    return super.runCalculate() + runPresentation();
  }
}
