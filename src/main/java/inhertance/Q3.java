package inhertance;
class Base {
  private void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub extends Base {
//  @Override
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }
//  abstract void doAbsStuff();
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}
public class Q3 {
  public static void main(String[] args) {
    Base b = new Sub();
    b.equals(null);
  }
}
