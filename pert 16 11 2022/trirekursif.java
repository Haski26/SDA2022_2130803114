import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * trirekursif
 */
public class trirekursif {
  static int nom;

  public static void main(String[] args) throws IOException {
    System.out.print("Masukan Angka : ");
    System.out.flush();
    nom = getInt();
    int jwb = triangle(nom);
    System.out.println("Triangle = " + jwb);
  }

  public static int triangle(int n) {
    if (n == 1)
      return 1;
    else
      return (n + triangle(n - 1));
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