package behavioral_patterns.command;

public class Builder {
  Command start;
  Command stop;

  public Builder(Command start, Command stop) {
    this.start = start;
    this.stop = stop;
  }

  public void startMethod() {
    start.execute();
  }

  public void stopMethod() {
    stop.execute();
  }
}
