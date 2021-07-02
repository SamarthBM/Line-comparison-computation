import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line comparison computation program");
		
		int x1, x2, y1, y2, a1, a2, b1, b2;
		Scanner sc = new Scanner(System.in);
		
		// User input for line 1 co-ordinates
		System.out.println("Enter the value for x1 co-oridnate");
		x1 = sc.nextInt();
		
		System.out.println("Enter the value for x2 co-oridnate");
		x2 = sc.nextInt();
		
		System.out.println("Enter the value for y1 co-oridnate");
		y1 = sc.nextInt();
		
		System.out.println("Enter the value for y2 co-oridnate");
		y2 = sc.nextInt();
		
		// User input for line co-ordinates
		System.out.println("Co-ordinates for line 2");
		
		System.out.println("Enter the value for a1 co-oridnate");
		a1 = sc.nextInt();
		
		System.out.println("Enter the value for a2 co-oridnate");
		a2 = sc.nextInt();
		
		System.out.println("Enter the value for b1 co-oridnate");
		b1 = sc.nextInt();
		
		System.out.println("Enter the value for b2 co-oridnate");
		b2 = sc.nextInt();
		
		// Calculating the length of line 1 and line 2	
		double len1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double len2 = Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println("The lenght of the line 1 is " + len1);
		System.out.println("The lenght of the line 2 is " + len2);
		
		// Equality check of line 1 and line 2
		if (len1 == len2)
		{
			System.out.println("The length of line 1 and line 2 are equal");
		}
		else
		{
			System.out.println("The length of line 1 and line 2 are not equal");
		}



	}

}
