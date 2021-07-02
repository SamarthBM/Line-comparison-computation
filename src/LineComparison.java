import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line comparison computation program");
		
		int x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for x1 co-oridnate");
		x1 = sc.nextInt();
		
		System.out.println("Enter the value for x2 co-oridnate");
		x2 = sc.nextInt();
		
		System.out.println("Enter the value for y1 co-oridnate");
		y1 = sc.nextInt();
		
		System.out.println("Enter the value for y2 co-oridnate");
		y2 = sc.nextInt();	
			
		double len = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The lenght of the line is " + len);


	}

}
