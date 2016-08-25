// Now lets split this up so that we maintain good SRP practice.
// We have separated our API logic from our view handling logic.
// This means we can easily reuse the AnimalApi class in other places.
public class AnimalListController implements NetworkCallback<List<Animal>> {
  private AnimalApi animalApi;

  public AnimalListController(AnimalApi api) {
    this.animalApi = api;
  }

  private void addAnimalsToView(List<Animal> animals) {
    this.animalListView.getAdapter().add(animals);
    this.animalListView.notifyContentChanged();
  }

  @Override
  void onSuccess(List<Animal> animalList) {
    if (animalList != null && animalList.size() > 0) {
      addAnimalsToView(animalList);
    }
  }

  @Override
  void onFailed(Throwable error) {
    System.out.println("ERROR: " + error.getMessage());
  }
}

/** Setup our network request items. */
public class AnimalApi {
  private String url;

  public AnimalApi(String url) {
    this.url = url;
  }

  // Sets up our request to the webMethod
  private void getAnimalList(NetworkCallback<List<Animal>> callback) {
    new HttpUrlRequest(this.url, RequestType.GET).call(callback);
  }
}
