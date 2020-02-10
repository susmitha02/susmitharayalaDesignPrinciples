package Calculator;

import java.util.*;
public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        // nextDouble() reads the next double from the keyboard
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;
        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }

	}


