import java.util.*;

public class Token {
   public static void main(String[] args) {
      StringTokenizer st = new StringTokenizer("my,name,is,khan");
     System.out.println("Next token is : " + st.nextToken(","));
   }
}