// This is a pretty large interface, do all bombs really have this many wires?
public interface BombWires {

  void blueWire();
  void redWire();
  void greenWire();
  void greyWire();
  void secondBlueWire();
  void thirdBlueWire();
  void offWhiteWire();
  void theOnlyWireThatSomeBombsHave();
  void theRightWire();
  void otherBlueWire();
}

// In this example, no, they don't. In particular, this bomb has only two wires.
// So we just implemented an interface with way more than two wires for this bomb.
// This is confusing to say the least, and doesn't fit in with the interface
// Segregation Principle.
public class BombWithTwoWires implements BombWires {

  public BombWithTwoWires() {}

  // I'm not writing all of those methods in here again, but you should get
  // the idea
}
