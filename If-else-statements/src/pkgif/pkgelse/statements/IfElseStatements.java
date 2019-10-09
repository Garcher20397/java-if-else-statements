
package pkgif.pkgelse.statements;

// Import Scanner Here
import java.util.Scanner;


/**
 *
 * Name:Grant Archer
 * Period:2
 * Project Name:IF Else
 * 
 * 
 */
public class IfElseStatements {

    // Create Scanner Object here So it may be used in all methods
  static Scanner kb = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        // Happy Coding!
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        //Invoke the methods here 
        
        
        
    }
    
    
    public static void question1(){
       System.out.println("Enter a number: ");
        int score = kb.nextInt();
        if (score > 70){
        System.out.println("PASSING");
        }
        else{
        System.out.println("NOT PASSING");
        }
    }
    
    
    public static void question2(){
         System.out.println("Enter a number: ");
        int numba = kb.nextInt();
        if (numba <= 50){
        System.out.println("GO");
        }
        else{
          System.out.println("STOP");
        }
    }
    
    public static void question3(){
        System.out.println("Enter an integer: ");
        int integer = kb.nextInt();
         if ((integer % 2 == 0)){
         System.out.println("EVEN");
         }
         else{
         System.out.println("ODD");
         }
    }
    
    public static void question4(){
        System.out.println("Enter an integer: ");
        int num = kb.nextInt();
        if ((num % 5 == 0)){
         System.out.println("MULTIPLE OF 5");
         }
         else{
         System.out.println("NOT A MULTIPLE OF 5");
         }
    }
    
    public static void question5(){
         System.out.println("Enter an number: ");
        int x = kb.nextInt();
        if (x < 10){
        System.out.println("ONE DIGIT");
        }
        else if(x >= 100){
          System.out.println("THREE DIGITS");
        }
        else{
        System.out.println("TWO DIGITS");
        }
    }
    
    public static void question6(){
         System.out.println("Enter a jersey number: ");
         int jersey = kb.nextInt();
         if (jersey == 12 || jersey == 71 || jersey == 80){
         System.out.println("That number is retired from the Seattle Seahawks!");
         }
    }
    
    public static void question7(){
        System.out.println("Enter a state: ");
        String state = kb.nextLine();
        if ("Washington".equals(state) || "Oregon".equals(state) || "Idaho".equals(state)){
            System.out.println("That state is in the PNW!");
        }
        else{
        System.out.println("You should move to the PNW; it's great there!");
        }
    }
    
    public static void question8(){
        System.out.println("Enter a Starbucks cup size: ");
        String cup = kb.nextLine();
        if ("Short".equals(cup)){
        System.out.println("That is 8 oz");
        }
        else if ("Tall".equals(cup)){
        System.out.println("That is 12 oz");
        }
        else if ("Grande".equals(cup)){
        System.out.println("That is 16 oz");
        }
        else{
        System.out.println("That is 20 oz");
        }
    }
    
    public static void question9(){
         System.out.println("Enter your wage per hour: ");
        int wage = kb.nextInt();
         System.out.println("Enter your hours worked: ");
        int hours = kb.nextInt();
        if (hours > 40){
        System.out.println("Your gorss is: " + ((40 * wage) + ((hours - 40) * (wage * 1.5))));
        }
        else{
        System.out.println("Your gross is: " + (hours * wage));
        }
    }
    
    public static void question10(){
         System.out.println("Enter your wage per hour: ");
        int wage = kb.nextInt();
         System.out.println("Enter your hours worked: ");
        int hours = kb.nextInt();
        if (hours > 40 && hours < 60){
        System.out.println("Your gorss is: " + ((40 * wage) + ((hours - 40) * (wage * 1.5))));
        }
        else if (hours < 40){
        System.out.println("Your gross is: " + (hours * wage));
        }
        else{
        System.out.println("Please see manager");
        }
        
    }
    
}
