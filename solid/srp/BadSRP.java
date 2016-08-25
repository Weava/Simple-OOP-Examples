// This is an example of how NOT to do Single Responsibility Principle.
// We are doing to many things in one class, setting up our network call,
// executing it, then setting the result to the UI.

/**
* Setup the url request to retrieve items, then call the web method to retrieve
* the animal list. Afterwards, display it to the UI.
*/
public class AnimalListController implements NetworkCallback<List<Animal>>{

  private HttpUrlRequest listRequest;
  private ListView animalListView;

  public AnimalListController() {
    listRequest = setHttpRequest();

    // Set NetworkCallback<List<Animal>> as the callback for listRequest.call
    listRequest.call(this);
  }

  // Sets up our request to the webMethod
  private HttpUrlRequest setHttpRequest() {
    return new HttpUrlRequest("http://www.animals.com/api/animallist", RequestType.GET);
  }

  // Set our animalList to the view.
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
