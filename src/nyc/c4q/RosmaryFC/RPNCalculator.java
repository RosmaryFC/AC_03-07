package nyc.c4q.RosmaryFC;
import java.util.Scanner;

/**
 * Created by c4q-rosmary on 3/7/15.
 */

public class RPNCalculator {
    public static void main(String[] args){
        double number00;
        double number01;
        char sign;
        double answer;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number");
        number00 = input.nextDouble();

        System.out.println("Please enter your second number");
        number01 = input.nextDouble();

        System.out.println("Please enter an operator");
        sign = input.next().charAt(0);

        if(sign == '+' ) { //+
            answer = number00 + number01;
        } else if (sign == '-'){//-
            answer = number00 - number01;
        } else if(sign == '/') {// /
            answer = number00 / number01;
        } else {// *
            answer = number00 * number01;
        }

        System.out.println("Result:" + answer );

    }
}


/*
a + b
a - b
a / b
a * b
a % b
 */