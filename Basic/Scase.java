import java.util.Scanner;
public class Scase{
 public static void main(String[]args){
 
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the day : " );
 String day  = scanner.nextLine();
 

 switch(day){
    case "Monday" -> System.out.println("It's Weekday😭");
    case "Tuesday" -> System.out.println("It's Weekday😭");
    case "Wednesday" -> System.out.println("It's Weekday😭");
    case "Thursday" -> System.out.println("It's Weekday😭");
    case "Friday" -> System.out.println("It's Weekday😭");
    case "Saturday" -> System.out.println("It's Weekday😭");
    case "Sunday" -> System.out.println("It's Weekend 😁");
    default -> System.out.println(day + "is not a day");
    }
 }
}
