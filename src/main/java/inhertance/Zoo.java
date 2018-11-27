package inhertance;

public class Zoo {
  // "Actual parameter" is assigned to the "formal parameter"
  public static void showLegCount(Animal a) {
    System.out.println("Number of legs is " + a.legCount);
  }

  public static void main(String[] args) {
    Animal a = new Animal();
    // Cat is-a Animal, so can use the Animal reference type
    // Assignment of "more specific" to "more general" is allowed
//    Animal b = new Cat();
    Cat b = new Cat();
    b.legCount = 4;
    showLegCount(b); // <== b is the "actual parameter"
    b.purr();

    Animal[] zoo = new Animal[2];
    zoo[0] = a;
    zoo[1] = b;

    // Assignments are only possible when Liskov Substitution
    // will be ensured
//    Cat c = new Animal();
    // This would be "a surprise"
//    c.purr();
  }
}
