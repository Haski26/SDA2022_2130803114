import java.util.Scanner;

public class rekursi {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("brp byk = ");
    int byk = in.nextInt();
    HalloDunia(byk);

  }

  static void HalloDunia(int i) {
    if (i > 0) {
      System.out.println("Hallo dunia" + i);
      HalloDunia(i);
    }
  }
}
