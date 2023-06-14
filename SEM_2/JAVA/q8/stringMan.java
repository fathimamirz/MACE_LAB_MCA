public class stringMan {
    public static void main(String[] args) {

         String str="Hello, world!";

         int length =str.length();
         System.out.println ("length" + length);

         String substring = str.substring(7);
         System.out.println("Substring: "+ substring);

         String concat=str.concat ("welcome");

         System.out.println("concatenation:" + concat);

         String replaced = str.replace ("world", "Java");
         System.out.println("Replace:" + replaced);

         String[] SplitArray=str.split (",");
         System.out.println("Split");

         
         for (String s: SplitArray) {

              System.out.println(s);

            }

         String uppercase= str.toUpperCase();
         System.out.println("Uppercase : " + uppercase);
         String lowercase=str.toLowerCase();
         System.out.println("Lowercase : " + lowercase);
    }
}

