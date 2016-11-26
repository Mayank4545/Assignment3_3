
public class Assignment3_3 {
	int x; int y;
	String name;
	public static void main(String args[]) {
		Assignment3_3 pnt = new Assignment3_3();
		System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
	}
}

/* Solution */
//The correct answer is:
//d. The program prints pnt is null 0 0.
//
//Because program creates default constructor to initialize the variables.
//Thus after initialization, "string" variable will be NULL and "int" variables will be 0.