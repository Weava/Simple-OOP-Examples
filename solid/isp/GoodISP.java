// This is more like it. This is a small interface. Remember that you can
// always extend interfaces if necessary.
public interface TwoBombWires {
  void blueWire();
  void redWire();
}

// We have successfully segregated interfaces so that we aren't letting this
// class bite off more than it can chew.
public class BombWithTwoWires implements TwoBombWires {

  public BombWithTwoWires() {}

  // I'll actually write the methods this time, this isn't so bad.
  @Override
  public void blueWire() {
    Sytem.out.println("Bomb defused");
  }

  @Override
  public void redWire() {
    System.out.println("BOOOOOOMMMMM!");
  }
}
