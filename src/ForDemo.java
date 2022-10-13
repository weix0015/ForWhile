public class ForDemo {
  public static void main(String[] args) {
    int j;
    for (int i = 1; i <= 10; i++) {
      System.out.print(i);
    }

    System.out.println();

    System.out.println((int)'A'); // Udskriver Ascii-værdi for A (65)

    for (char c = 'A'; c <= 'Z'; c++) {
      System.out.print(c);
    }

    System.out.println();
    for (char c = 'Z'; c >= 'A'; c--)
      System.out.print(c);

    System.out.println();
    for (char c = 'A'; c <= 'Å'; c++)
      System.out.print(c);

    System.out.println("\nACSII values:");
    System.out.println("A: " + (int)'A');
    System.out.println("Z: " + (int)'Z');
    System.out.println("Æ: " + (int)'Æ');
    System.out.println("Ø: " + (int)'Ø');
    System.out.println("Å: " + (int)'Å');
  }
}
