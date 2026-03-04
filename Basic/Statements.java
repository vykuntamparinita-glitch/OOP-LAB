import java.util.Scanner;

public class Statements{
 public static void main(String[] args){
 
 // if statement 

 Scanner scanner = new Scanner(System.in);

 String name;
 int age;

 System.out.println("Enter ur name : ");
 name = scanner.nextLine();
 
 System.out.println("Enter your age: ");
 age = scanner.nextInt();	
 
//GROUP 1

  if(name.isEmpty()){
      System.out.println("You didnot enter ur name!");
  }
  else{
      System.out.println("Hello " + name + "!");

  }

  if (age >= 65){
       System.out.println("You are a senior!");
  }

  else if (age >= 18){ 
      System.out.println("You are an adult!");
  
  }
  else if (age < 0){
       System.out.println("You haven't been born yet!");
 }
 else if (age == 0){
      System.out.println("You are a baby!");
 }

  else{
      System.out.println("You are a child");
  }
  scanner.close();
 }
}  
