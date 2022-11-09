import java.util.Queue;
import java.util.LinkedList;

public class equeque {
  public static void main(String[] args) {

    Queue<String> antrian = new LinkedList<String>();
    antrian.offer("rahman");
    antrian.offer("putra");
    antrian.offer("rizal");
    antrian.offer("hafis");
    System.out.println(antrian);

    System.out.println("banyak antrian = " + antrian.size());
    System.out.println(antrian.contains("putra"));
    System.out.println(antrian.contains("kim"));

  }
}
