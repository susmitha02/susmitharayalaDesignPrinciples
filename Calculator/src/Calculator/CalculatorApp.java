package Calculator;

import java.util.*;

public class CalculatorApp {
     public static void main(String args[])
     {
    	 CalculatorApp c=new   CalculatorApp();
    	 System.out.println("enter two numbers");
    	 int a,b;
    	 Scanner sc=new Scanner(System.in);
    	 a=sc.nextInt();
    	 b=sc.nextInt();
    	 System.out.println("sum of numbers is");
    	 System.out.println(c.add(a,b));
    	 System.out.println("diff of numbers is");
    	 System.out.println(c.sub(a,b));
    	 System.out.println("mul of numbers is");
    	 System.out.println(c.mul(a,b));
    	 System.out.println("div of numbers is");
    	 System.out.println(c.div(a,b));
    	 
    	 
     }
     public int add(int x,int y) {
    	 return(x+y);
     }
     public int sub(int x,int y) {
    	 return(x-y);
     }
     public int mul(int x,int y) {
    	 return(x*y);
     }
     public int div(int x,int y) {
    	 return(x/y);
     }
}
