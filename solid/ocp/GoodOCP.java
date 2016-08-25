// With this, we have now reduced how much code we had to write, as well as stopped
// the problem of ballooning switch statements. You can imagine implementing
// AnimalQuery in whatever way you need it.
public class GetAnimalService
{
  public ListInterface<Animal> findAnimals(AnimalQuery query) {
    ListInterface<Animal> animals = query.getAnimals(GetAllAnimals());
    return animals;
  }
}

// Implement AnimalQuery to filter the animals in whichever way you want,
// Then pass the implementation to GetAnimalService.
public interface AnimalQuery {
  ListInterface<Animal> getFilteredAnimals(ListInterface<Animal> animals);
}
