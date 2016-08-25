// As you can see, Liskov substitution principle is broken, as we have abstractions
// that simply do not make sense for most animals.
public abstract class Animal {
  private int numLegs;
  private int numTimesBarked;

  public Animal() {}

  // Not all animals walk.
  protected abstract void walk();

  // Fish can't bark, in fact, many animals can't bark.
  public int getTimesBarked() {
    return this.numTimesBarked;
  }
}

public class Fish extends Animal {

  public Duck() {
    super();
    
    // This doesn't make sense.
    getTimesBarked();
  }

  @Override
  protected void walk() {
    throw new UnsupportedOperationException("Fish can't walk ya dingus :/");
  }
}
