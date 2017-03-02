package codeguide;

import java.util.Scanner;

/**
 * Exercise of DRY and Meaningful naming.
 * Please eliminate duplicate code and change.
 * This is java code for convert Thai money to Japanese money.
 * @author Charin Tantrakul
 *
 */
public class Exercise {

	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter m money : ");
		double m = input.nextDouble();
		if(m>0){
			m = m/0.32;
			System.out.printf("You got %.2f Yen",m);
		}else if(m<0){
			System.out.print("You got 0 yen");
		}else if(m==0){
			System.out.print("You got 0 yen");
		}
	}
}
