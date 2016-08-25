// Animal is our base class containing abstractions that many animals have.
public class Animal {
  private int numFeet;
  private String name;
  private String latinName;

  public Animal(String name, int numFeet, String latinName) {
    this.numFeet = numFeet;
    this.name = name;
    this.latinName = latinName;
  }

  public String getName() {
    return this.name;
  }
}

// Notice that Duck 'Extends' our Animal class. This means it gains all of the
// methods that Animal had
public class Duck extends Animal {

  public Duck() {
    super("Duck", 2, "Scroogus McDuckas");

    System.out.println(this.getName()); // Will print "Duck"
  }


}
