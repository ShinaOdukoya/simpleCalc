/*A simple calculator program written by Shina Odukoya
It accept 3 input from user;
first and last input are type int while second input is the operator
Note exponential is denoted by double **
*/

import java.util.Scanner;

public class SimpleCalculator{
    public static void main (String []args){

        //import scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to input first number
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();

        //Prompt the user to input an operator
        System.out.println("Enter an operator: ");
        String operator = input.next();
        
        //Prompt the user to input second number
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        //variable int is declared as global so as to be used in the for loop
        int answer = 1;

        int temp;
        
        //A condition statement to test for + "addition"
        if (operator.equals("+")){
            int answer1 = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + answer1);
        }

        //A condition statement to test for - "subtraction"
        else if (operator.equals("-")){
            int answer2 = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + answer2 );
        }

        //A condition statement to test for * "multiplication"
        else if (operator.equals("*")){
            System.out.println(number1 + " * " + number2 + " = " + number1 * number2);
        }

        //A condition statement to test for / "division"
        else if (operator.equals("/")){
            System.out.println(number1 + " / " + number2 + " = " + number1 / number2);

        //A condition statement to test for % "modulus operator"
        }else if (operator.equals("%")){
            System.out.println(number1 + " % " + number2 + " = " + number1 % number2);

        //Test for exponential
        }else if (operator.equals("**")){
            int x =0;
            int i;
        //For loop to loop through second input entered by the user which is assumed to be the exponent
            for ( i = 1; i<=number2; i++){

            //condition statement to check that number is greater than 0, hence the for loop is executed
                //if(number2 != 0){
                   //while (number2 != 0){

                  // }
                  //number1 is stored in temp variable immediately loop begins
                  temp = number1;

                  //then variable answer is multiplied by temp throughout the loop
                  answer = answer * temp;
                   
                }
                   
                //print variable answer
                System.out.println(number1 + " ** " + number2 + " = " + answer);
               
            }
            
            
            
        
    }
}