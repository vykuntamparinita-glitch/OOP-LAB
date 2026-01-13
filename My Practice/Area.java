import java.util.Scanner;

public class Area{
 public static void main (String[] args){
 Scanner scanner = new Scanner(System.in);

 // Calculate the Area of Rectangle
 int area_of_rectangle = 0;

 System.out.println("Enter the length of the Rectangle : ");
 int length = scanner.nextInt();
 System.out.println("Enter the breadth of the Rectangle : ");
 int breadth = scanner.nextInt();
 area_of_rectangle = length * breadth;
 
 System.out.println("Length : " + length);
 System.out.println("Breadth : " + breadth);
 System.out.println("Area : " + area_of_rectangle);
 
 
 scanner.close();
 }
}
