import java.io.*; 
import java.util.*; 
  
class ArrayListString { 

	
	 public static void main(String[] s) 
    { 
        
        int n = 5;
		 
        
        ArrayList<String> st= new ArrayList<>(n); 
  
         
        for (int i = 1; i <= n; i++) 
		            st.add("Fruit "+ i ); 
  
         
        System.out.println(st); 
		st.set( 1,"Apple");
		st.add( 2,"Orange");
  System.out.println(st); 
         
        st.remove(4); 
  
   
        System.out.println(st);  
        for (int i = 0; i < st.size(); i++) 
            System.out.print(st.get(i) + " "); 
    } 
} 
