import java.util.Scanner;

public class Shopping{
 public static void main(String[] args){
 String item;
 double price;
 int quantity;
 char currency = '$';
 double total; 

  Scanner scanner = new Scanner(System.in);

  System.out.println("What would u like to buy : ");
  item = scanner.nextLine();

  System.out.println("What is the price for each : ");
  price = scanner.nextDouble();

  System.out.println("How many would like ? : ");
  quantity = scanner.nextInt();
  
  total = price * quantity;

  System.out.println("\nYou have brought " + quantity + " " + item + "/s");
  System.out.println("Your total is " + currency + total);

  scanner.close();
 }
}
   
   
  