package structural_patterns.decorator;

public class NoteBookDecorator implements Notebook{
  Notebook notebook;

  NoteBookDecorator(Notebook notebook){
    this.notebook = notebook;
  }

  @Override
  public String runCalculate() {
    return notebook.runCalculate();
  }
}
