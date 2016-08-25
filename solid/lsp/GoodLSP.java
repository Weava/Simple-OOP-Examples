// Let's fix up that last example to work better with LSP. This will be
// similar to a previous example we had using Ducks. We have abstracted more
// common elements of animals. (Not all animals have legs, but you can just set
// this to 0)
public abstract class Animal {
  protected int numLegs;
  protected String name;

  public Animal(int numLegs, String name) {
    this.numLegs = numLegs;
    this.name = name;
  }

  public int getNumLegs() {
    return this.numLegs;
  }
}

public class Fish extends Animal {

  public Fish() {
    super(0, "Fish");
    System.out.println(this.name); // Will print "Fish"
  }

  // This makes sense, as swimming is unique to water animals.
  // We could abstract further to have a water animals class, but this is
  // fine for an example.
  public void swim() {
    System.out.println("Fish can swim though :)");
  }

}
