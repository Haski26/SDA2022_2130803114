import java.util.Scanner;

public class fungsirekursiv {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukan Nilai = ");

    int n = in.nextInt();
    System.out.println("Anda Memasukan Nilai = " + n);
    printn(n);
  }

  private static void printn(int parameter) {
    System.out.println("Nilai = " + parameter);
    if (parameter == 0) {
      return;
    }
    parameter--;
    printn(parameter);
  }

}
