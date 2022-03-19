public class Animal{

     public static String getDefaultGreeting(){
         return "Hello";
     }
     public static String catGreeting() {
               return "Meow";
     }
     public static void main(String[] args) {

         String firstArgumenet=args[0];

         if(firstArgumenet.equalsIgnoreCase("cat")) System.out.println(catGreeting());

        else  System.out.println(getDefaultGreeting());

        

     }

}