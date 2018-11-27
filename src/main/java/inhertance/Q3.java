package inhertance;
class Base {
  private void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
  int doBaseStuff2() {
    System.out.println("doBaseStuff");
    return 1;
  }

}

class Sub extends Base {
  // inherited..
  // int doBaseStuff2() { ... }
  String doBaseStuff2(int x) { return "Hello";}
//  String doBaseStuff2() { return "Hello";}
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
