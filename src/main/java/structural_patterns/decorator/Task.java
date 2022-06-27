package structural_patterns.decorator;

public class Task {
  public static void main(String[] args) {
    Notebook notebook = new MacBook2024(new MacBook2022(new MacBook2020(new MacBook2015())));
    System.out.println(notebook.runCalculate());
  }
}
