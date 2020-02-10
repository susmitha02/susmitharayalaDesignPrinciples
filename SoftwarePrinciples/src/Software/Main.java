package Software;
import java.util.*;

import Software.Solid.Car;
public class Main {

	public static void main(String[] args) throws Exception{
		Kiss m=new Kiss();
		Dry d=new Dry();
		Solid s=new Solid();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of month you would like to have serice:");
		int n=sc.nextInt();
		System.out.println("enter number of day you would like to have serice:");
		
		int n2=sc.nextInt();
		System.out.println(m.monthname(n));
		System.out.println(m.dayname(n2));
		System.out.println("enter your vehicle name:");
		String name=sc.next();
		System.out.println("Choose your services:");
		System.out.println("1.car services...");
		System.out.println("2.bike services...");
		int i=sc.nextInt();
		if(i==1)
		{
			d.serviceCar();
			System.out.println("Your car "+name +s.engine());
		}
		else if(i==2)
		{
			d.serviceBike();
			System.out.println("Your bike "+ name + s.motor());
		}
		else
		{
			System.out.println("No such services are available");
		}
		
		System.out.println("thank you!visit again");
		
		
		
		// TODO Auto-generated method stub

	}

}

