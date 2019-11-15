package demo;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {

		try {														//Try block will run first if failed will go to catch
			errorDemo();											//Calling the function
		} 
		
		catch (Exception e) {										//Catch block will run only if something in the try block failed
			
			System.out.println("Hi from catch block");				//Print message in catch block	
			System.out.println("Message is : " +e.getMessage());	//Printing the exception message
			System.out.println("Couse is : " +e.getCause());		//Printing the exception cause
		
			e.printStackTrace();
		}

	}
	
	public static void errorDemo() throws Exception {
		
		System.out.println("Hello world.....!!!!");				//Print message
		throw new ArithmeticException("not valid operation");
		//int i = 1/0;											//Dividing by zero to get an error will not get to completed message

		//System.out.println("Hello Completed");					//Print message
		
	}

}
