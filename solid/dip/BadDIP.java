// In most OOP languages, public static means that a member can be accessed outside
// any instance of the class, effectively making these items global. Global items
// cause dependency nightmares, as many different modules might depend on them.
// Changing them can affect too many pieces of your program.
public class DateUtils {
  public static Date getDate() {
    return DateTime.now();
  }

  public static String convertDateToString(Date date) {
    return date.toString();
  }
}

// Directly using constructor within implementing class couples the two
// modules directly, and requires you to change more pieces of the program
// if modifications to either class become necessary.
public class MyDateClass {

  private DateApi dateApi;

  public MyDateClass() {
    this.DateApi = new DateApi("http://thedate.com/api");
  }
}
