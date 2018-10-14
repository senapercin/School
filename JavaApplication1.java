package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an number");
        double amount =input.nextDouble();
        int remainingAmount =(int)(amount*100);
        int oneDollars =remainingAmount /100;
        remainingAmount =remainingAmount%100;
        int quarters =remainingAmount / 25;
        remainingAmount =remainingAmount %25;
         System.out.println("Your amount " + amount + " consists of");
           System.out.println("    " + oneDollars + " dollars"); 
           System.out.println("    " + quarters + " quarters ");  
          
    }   
}
