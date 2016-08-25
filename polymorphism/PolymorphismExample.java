public abstract class Animal {
  private int numFeet;
  private String name;
  private String latinName;

  public Animal(String name, int numFeet, String latinName) {
    this.numFeet = numFeet;
    this.name = name;
    this.latinName = latinName;
  }

  public abstract String getName();
}

public class Duck extends Animal {

  public Duck() {
    super("Duck", 2, "Scroogus McDuckas");
  }

  @Override
  public String getName() {
    return this.name;
  }
}

// Using our Duck example from before, we can investigate how polymorphism works
public class AnimalKeeper {

  // Notice we have a type Animal, but Animal is abstract, meaning we can't
  // actually create a new Animal type directly.
  private Animal keptAnimal;

  public AnimalKeeper() {

    // Duck extends Animal, effectively making it an Animal type with its own
    // implementation.
    this.keptAnimal = new Duck();

    // You'll see here that we can call the abstract getName from the Animal class,
    // Even though it has been implemented in the Duck class.
    System.out.println(this.keptAnimal.getName()); // Will print "Duck"
  }
}
