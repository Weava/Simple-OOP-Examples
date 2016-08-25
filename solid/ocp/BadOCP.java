// This is bad Open Closed Principle code, as we have a potentially ballooning
// set of cases that will have to be added onto every time it is updated.
public class GetAnimalService
{
  public ListInterface<Animal> findAnimals(AnimalType type) {
    ListInterface<Animal> animals;
    switch (type) {
      case AnimalType.DUCK:
        // load ducks into animals list.
        break;
      case AnimalType.DEER:
        // load deer into animals list.
        break;
      case AnimalType.DOG:
        // load dogs into animals list.
        break;
    }
    return animals;
  }
}
