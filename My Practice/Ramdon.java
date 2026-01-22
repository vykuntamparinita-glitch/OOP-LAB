import java.util.Random;
public class Ramdon{
 public static void main(String[]args){
  
 Random random = new Random();
 
 int number_1;
 int number_2;
 int number_3;
 number_1 = random.nextInt(1,8);
 number_2 = random.nextInt(1,20);
 number_3 = random.nextInt(1,16);

 double number;
 
 number = random.nextDouble();

 boolean isHeads;
 
 isHeads = random.nextBoolean(); 
 
 if (isHeads){
       System.out.println("Heads");
 }
 
 else{
   System.out.println("Tails");
 }

 System.out.println(number_1);
 System.out.println(number_2);
 System.out.println(number_3);
 System.out.println(number);
 }
}