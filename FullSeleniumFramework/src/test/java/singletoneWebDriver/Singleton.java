package singletoneWebDriver;

public class Singleton {
	
private static Singleton singleton_instance = null;		//A private parameter that is set to null
	
	public String str;										//String parameter
	
	private Singleton() {									//Private Constructor 
		str="Using singleton class pattern";				//Setting the string parameter in the Constructor
	}
	
	public static Singleton getInstance() {					//A get method	-- Lazy Initialization
		if (singleton_instance == null)						//Checking if singleton_instance is null
			singleton_instance = new Singleton();			//If is null initializing from the constructor 
		return singleton_instance;							//Returning the object parameter
	}
	

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();				//Creating x object of Singleton and calling the get method
		Singleton y = Singleton.getInstance();				//Creating y object of Singleton and calling the get method
		Singleton z = Singleton.getInstance();				//Creating z object of Singleton and calling the get method
		
		x.str = (x.str).toUpperCase();						//Converting the string in str to Upper case and storing in x.str
		
		System.out.println("X = "+x.str);					//Printing X from str
		System.out.println("Y = "+y.str);					//Printing Y from str
		System.out.println("Z = "+z.str);					//Printing Z from str
		
		z.str = (z.str).toLowerCase();						//Converting the string in str to Lower case and storing in x.str
		
		System.out.println("X = "+x.str);					//Printing X from str
		System.out.println("Y = "+y.str);					//Printing Y from str
		System.out.println("Z = "+z.str);					//Printing Z from str
	}

}
