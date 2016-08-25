// Interfaces contain non-implemented method stubs defining a method's
// name, parameters, and return type.
public interface AnimalActions {
  void move(int distance);
  void eat(String foodName);
}

// Notice we have added the implements keyword for AnimalActions, enforcing
// us to implement the AnimalActions interface.
public class Duck extends Animal implements AnimalActions {

  public Duck() {
    super("Duck", 2, "Scroogus McDuckas");
  }

  // Notice that these two methods with @Override are the same ones as the
  // interface. They must adhere to the same specs that the interface has created.
  // All interface methods must be public.
  @Override
  public void move(int distance) {
    System.out.println("Moved " + Integer.toString(distance) + " feet");
  }

  @Override
  public void eat(String foodName) {
    System.out.println("Ate a " + foodName);
  }
}
