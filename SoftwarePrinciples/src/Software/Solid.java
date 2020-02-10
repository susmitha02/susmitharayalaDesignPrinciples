package Software;

public class Solid {
	
	   String na,s,p;
	   String carname,bikename;
	   public void setName(String name) {
		   this.na=name;
		   carname=name;
		   bikename=name;
		   
	   }
	   public String engine() {
		   s="is ready to use";
		   return s;
	   }
	   
	
	    public String motor() {
	    	
	    	p="is in good condition";
	    	 return p;
		   
		}

		class Car extends Solid {
			
			  public String setName() {
				  return carname;
				   
			   }
			  public void engine() {
				   System.out.println("s");
			   }
	
		    
		}
		class Bike extends Solid{
			  public String setName() {
				  return bikename;
			  }
			public void motor()
			{
				System.out.println("p");
			}
			
			 
		}

}
