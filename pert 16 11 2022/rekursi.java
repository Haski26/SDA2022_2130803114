import java.util.*;

public class rekursi {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukan Nilai = ");

    int n = in.nextInt();
    System.out.println("Anda Memasukan Nilai = " + n);
    printn(n);
  }

  private static void printn(int parameter) {
    System.out.println("Nilai = " + parameter);
    printn(parameter);
  }
}
