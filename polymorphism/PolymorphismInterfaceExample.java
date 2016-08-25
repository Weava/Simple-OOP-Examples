public interface AnimalActions {
  void move(int distance);
  void eat(String foodName);
}

public class Duck extends Animal implements AnimalActions {

  public Duck() {
    super("Duck", 2, "Scroogus McDuckas");
  }

  @Override
  public void move(int distance) {
    System.out.println("Moved " + Integer.toString(distance) + " feet");
  }

  @Override
  public void eat(String foodName) {
    System.out.println("The " + this.getName() + " ate a " + foodName);
  }
}

public class AnimalKeeper {

  // Notice that this field is of an interface type.
  private AnimalActions keepersAnimalActions;

  public AnimalKeeper() {
    // Since Duck implements AnimalActions, we can represent Duck's implementation
    // of AnimalActions as the interface itself.
    keepersAnimalActions = new Duck();

    keepersAnimalActions.eat("tomato"); // Will print "The Duck ate a tomato"
  }
}
