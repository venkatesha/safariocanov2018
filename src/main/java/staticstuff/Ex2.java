package staticstuff;

class Y {
  int value = 99;
  static String sayHi(Y self) {
    String message = "Y-Hello " + self.value;
    return message;
  }
  static String sayHi() {
    // no "this" in a static method
    return "Y-Hello ";
  }
  String sayHi2() {
    return "Y-Hello2";
  }
}
class Z extends Y {
  static String sayHi() {
    return "Z-Hello";
  }
  String sayHi2() {
    return "Z-Hello2";
  }
}

public class Ex2 {
  public static void main(String[] args) {
    Y y = new Z();  // a Z "is a" Y
    System.out.println(y.sayHi() + ", " + y.sayHi2());
// equivalent to:
    System.out.println(((Z)y).sayHi() + ", " + y.sayHi2());

  }
}
