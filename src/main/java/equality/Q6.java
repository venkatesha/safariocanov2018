package equality;

public class Q6 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
//    s1 = s1.intern();
    String s2 = new String("Hello");
//    s2 = s2.intern();

    StringBuilder s3 = new StringBuilder("Hello");
    StringBuilder s4 = new StringBuilder("Hello");

    System.out.println("A " + (s1 == s2));
    System.out.println("B " + s1.equals(s2));
    System.out.println("C " + s1.equals(s3));
    System.out.println("D " + s3.equals(s4));
    System.out.println("E " + (s3 == s4));

  }
}
