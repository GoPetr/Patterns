package structural_patterns.decorator;

public class MacBook2024 extends NoteBookDecorator{
  MacBook2024(Notebook notebook) {
    super(notebook);
  }

  String runClouds(){
    return "run clouds ";
  }

  @Override
  public String runCalculate() {
    return super.runCalculate() + runClouds();
  }
}
