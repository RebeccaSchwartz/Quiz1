package quiz1;
import java.util.Scanner;


public class Quiz1 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert number of touch downs: ");
		int TD = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Insert nuber of yards: ");
		int Y = input2.nextInt();
		Scanner input3 = new Scanner(System.in);
		System.out.println("Insert nuber of interceptions: ");
		int IN = input3.nextInt();
		Scanner input4 = new Scanner(System.in);
		System.out.println("Insert nuber of completions: ");
		int COMP = input4.nextInt();
		Scanner input5 = new Scanner(System.in);
		System.out.println("Insert nuber of passes attempted: ");
		int ATT = input5.nextInt();
		
		input.close();
		input5.close();
		input2.close();
		input3.close();
		input4.close();
		
		double a = ((COMP/ATT) -3) * 5;
		double b = ((Y/ATT) - 3) * 0.25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - ((IN/ATT) * 25);
		
		a = Math.min(a, 2.735);
		a = Math.max(a, 0);
		b = Math.min(b, 2.735);
		b = Math.max(b, 0);
		c = Math.min(c, 2.735);
		c = Math.max(c, 0);
		d = Math.min(d, 2.735);
		d = Math.max(d, 0);
		
		double PR = ((a+b+c+d)/6) *100;
		
		System.out.printf("%.1f",PR);
		
	}

}
