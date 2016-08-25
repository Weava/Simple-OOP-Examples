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

// This one is easy, but important. Composition inherently ties an object
// to the lifecycle of a class.
public class CompositionExample {

  // This is a composite of our class, and will be tied to the entire scope
  // until the class is garbage collected.
  private Animal myAnimal;

  public CompositionExample(Animal animal) {
    // Here we have tied animal to a parameter from the outside, reducing
    // coupling between this class, and the necessary AnimalType;
    this.myAnimal = animal;

    // Here we have a tightly couple Animal, meaning, we would have to modify
    // this class to change functionality.
    this.myAnimal = new Animal("Duck", 2, "Scroogus McDuckas");
  }

  // Here we set it via method. This is looser coupling, but can also be error
  // prone, requiring you to check if animal is null, assuming you haven't
  // set this anywhere else.
  public void setAnimal(Animal animal) {
    this.myAnimal = animal;
  }

}
