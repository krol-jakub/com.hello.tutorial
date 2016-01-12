package HelloMaven.com.hello.tutorial;

public class HelloWorld {
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }

	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   
	   public void getMessage2(){
		   System.out.println(String.format("Your Message : %1$d",Integer.decode(message),2));
	   }
	}
