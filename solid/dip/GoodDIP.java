// This isn't the only way to fix util classes, but is very common. Utils classes
// are not good object oriented practice, and can almost always be replaced with
// some form of OOP.
public CustomDate extends Date {

  public CustomDate() {
    super();
  }

  public Date getDate() {
    return DateTime.now();
  }

  public String convertDateToString(Date date) {
    return date.toString();
  }
}

// We fixed this class by adding a constructor parameter, instead of instantiating
// within the constructor itself. We have also changed it to an interface.
// This will make swapping out DateApi implementations a breeze, and decouples
// the two modules quite well.
public class MyDateClass {

  private DateApiInterface dateApi;

  public MyDateClass(DateApiInterface dateApi) {
    this.DateApi = dateApi;
  }
}
