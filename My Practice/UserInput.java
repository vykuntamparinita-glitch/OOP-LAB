import java.util.Scanner;

public class UserInput {
 public static void main(String[]args){
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("Enter your name: ");
  String name = scanner.nextLine();
  System.out.println("Enter ur age: ");
  String age = scanner.nextLine();
  System.out.println("Enter ur favourite food" );
  String favourite_food = scanner.nextLine();
  System.out.println("Are u a student?");
  boolean isStudent = scanner.nextBoolean();
  System.out.println("Hello " + name);
  System.out.println("So, ur " + age);
  System.out.println("Ur favourite food is " + favourite_food);
  
  if(isStudent){
      System.out.println("You are Enrolled as a student");
  }
  else{ 
      System.out.println("Your not enrolled");
  }
  

  scanner.close();
 }
}