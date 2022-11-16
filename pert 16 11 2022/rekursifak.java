import java.util.Scanner;

public class rekursifak {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukan Nilai = ");

    int n = in.nextInt();
    System.out.println("Anda Memasukan Nilai = " + n);
    printn(n);
    int jml = jmln(n);
    System.out.println("total faktoraial = " + jml);
  }

  private static int jmln(int bts) {
    System.out.println("faktorial ke " + bts + " = " + bts);
    if (bts == 1) {
      return bts;
    }
    return bts * jmln(bts - 1);
  }

  private static void printn(int parameter) {
    System.out.println("Nilai = " + parameter);
    if (parameter == 1) {
      return;
    }
    parameter--;
    printn(parameter);
  }

}
