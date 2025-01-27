package firstprogrampackage;

public class FirstProgramClass 
{

	public static void main(String[] args) 
	{
		// printing stuff
		System.out.println("Hello World!");
		System.out.println("Testing using println(); ");
		System.out.print("This will print ");					//print vs println
		System.out.println("on the same line!");
				
		// printing numbers
		System.out.println(5);
		System.out.println(2*5);
		int integerNumber = 39;
		System.out.println(integerNumber);
				
		// variables
		String name = "John Doe";
		final double doubleNumber = -19.876;	// keyword final here means that doubleNumber is a constant variable
		System.out.println(name);
		System.out.print("Hello my name is ");
		System.out.print(name);;
		System.out.println(" and I like to code in Java!");
		System.out.print("This is a double variable: ");
		System.out.println(doubleNumber);
		
		// combining with +
		String firstName = "Johnny";
		String lastName = "Guitar";
		String fullName = firstName + lastName;
		System.out.println("Hello " + fullName);
		
		// comma separated lists when initializing variables
		// same as c++ for copying the same value into multiple variables (x = y = z = 50)
		int  a = 5, b = 10, c = 15;
		System.out.println("Printing a + b + c: " + (a + b + c));
	}

}
