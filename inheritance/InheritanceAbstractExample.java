// Animal is our base class containing abstractions that many animals have.
// For this example, we have declared it abstract. Abstract classes cannot
// be constructed directly. Instead, they must be extended by another class.
public abstract class Animal {
  private int numFeet;
  private String name;
  private String latinName;

  public Animal(String name, int numFeet, String latinName) {
    this.numFeet = numFeet;
    this.name = name;
    this.latinName = latinName;
  }

  // Abstract classes can have abstract methods. These methods must be
  // implemented in the child class. They can be called within this class
  // or within any class downwards in the hierarchy
  public abstract String getName();
}

// Notice that Duck 'Extends' our Animal class. This means it gains all of the
// methods that Animal had
public class Duck extends Animal {

  public Duck() {
    super("Duck", 2, "Scroogus McDuckas");

    System.out.println(this.getName()); // Will print "Duck"
  }

  @Override
  public String getName() {
    return this.name;
  }
}
