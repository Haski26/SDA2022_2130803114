import java.util.LinkedList;

public class linkdedlist {
   public static void main(String[] args) {

      LinkedList<String> ll = new LinkedList<String>();
      ll.push("A");
      ll.push("B");
      ll.push("C");
      ll.push("D");
      ll.push("F");
      ll.add(1, "E");
      ll.remove("E");
      System.out.println(ll.peekFirst());
      System.out.println(ll.peekLast());
      ll.addFirst("uiuaaa");
      ll.addLast("beng");
      ll.removeFirst();

      System.out.println(ll);
      ll.pop();
      System.out.println(ll);

   }
}
