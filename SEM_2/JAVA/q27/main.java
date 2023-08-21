import java.util.*;

  public class main {

  public static void main(String[] args) {

     // Create a empty hash set

        HashSet<String> h_set = new HashSet<String>();

     // use add() method to add values in the hash set

          h_set.add("Red");

          h_set.add("Green");

          h_set.add("Black");

          h_set.add("White");
		
		HashSet<String> h_set1 = new HashSet<String>();

          h_set1.add("Red");

          h_set1.add("Pink");

 		h_set1.add("Orange");

          h_set1.add("Black");
         

          HashSet<String> h_set2 = new HashSet<String>();

          h_set2.add("Red");

          h_set2.add("Pink");

          h_set2.add("Black");

          h_set2.add("Orange");

          //comparison output in hash set

          HashSet<String>result_set = new HashSet<String>();

		System.out.println( " Comparing values of h_set with h_set2 ");

         for (String element : h_set){

             System.out.println(h_set2.contains(element) ? "Yes" : "No");

          }     
	System.out.println(" After comparing h_set1 and h_set2 = "+ h_set1.equals(h_set2));

	boolean check=h_set.equals(h_set2);

	System.out.println(" After comparing h_set and h_set2 = "+check);
	
     }
}
