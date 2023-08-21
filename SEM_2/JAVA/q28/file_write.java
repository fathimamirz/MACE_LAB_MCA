import java.io.*;

class file_write{
public static void main(String Ar[]) throws IOException{
String s=" "; 
try{
InputStreamReader r=new InputStreamReader(System.in);
 	BufferedReader br =new BufferedReader(r);
System.out.println("Enter the string ");
String str = br.readLine(); 
FileWriter f=new FileWriter("/home/user/Documents/mirza/new.txt");
          
	BufferedWriter wr=new BufferedWriter(f);
        wr.write(str);
	wr.append(" existing file use append");
	wr.close();
System.out.println("Sucessfully written to the file "); 

FileReader f1=new FileReader("/home/user/Documents/mirza/new.txt");
    
	
		BufferedReader br2=new BufferedReader(f1);
		while((s=br2.readLine())!=null){
        		System.out.println(s);
        	}
r.close();
}catch(IOException w){System.out.println(w);}
}
}
