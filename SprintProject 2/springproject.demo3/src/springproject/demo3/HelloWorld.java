package springproject.demo3;

public class HelloWorld {
	private String message1;
	   private String message2;

	   public void setMessage1(String message){
	      this.message1 = message;
	     
	   }
	  
	public void setMessage2(String message){
	      this.message2 = message;
	    
	   }
	public void displayinfo() {
		System.out.println("World Message1 : " + message1); 
		System.out.println(" World Message2 : " + message2);
	}
	  
	}

