import java.util.Scanner;

public class RPS {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      String name = returnName(console);
      
      start(name);
      
   }
   
   public static String returnName(Scanner console) {
      System.out.print("Welcome to Philip' RPS program. Before we start, what is your name? > ");
      return console.next();
   }
   
   public static void start(String name) {
      System.out.println("Okay, " + name + ". Let's begin!");
      System.out.println("Choose your weapon (R, P or S)");
      
   } 
   
   
   
}
