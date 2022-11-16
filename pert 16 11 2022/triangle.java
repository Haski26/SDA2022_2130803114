
/**
 * a
 */
import java.io.*;

public class triangle {
  static int nom;

  public static void main(String[] args) throws IOException {
    System.out.print("Masukan Angka : ");
    System.out.flush();
    nom = getInt();
    int jwb = triangle(nom);
    System.out.println("Triangle = " + jwb);
  }

  public static int triangle(int n) {
    int tot = 0;
    while (n > 0) {
      tot = tot + n;
      --n;
    }
    return tot;
  }

  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }

  public static int getInt() throws IOException {
    String s = getString();
    return Integer.parseInt(s);

  }
}