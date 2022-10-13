import java.util.Scanner;

public class SdrawkcabEman {
  public static void main(String[] args) {
    String name = "";
    String nameBackwards = "";
    Scanner in = new Scanner(System.in);

    // Ask about name
    do {
      System.out.print("Enter your name: ");
      name = in.nextLine();
    } while (name.equals(""));

    // Reverse name
    for (int i = name.length() - 1; i >= 0; i--)
      nameBackwards += name.charAt(i);

    // Print reversed name
    System.out.println("Nice to meet you, " + nameBackwards.toUpperCase() + ".");
  }
}
