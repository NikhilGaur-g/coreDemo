import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		int sum=0;
		int no=0;
		Scanner ip = new Scanner(System.in);
		// do...while loop continues
	    // until entered number is positive
		do {
			sum=sum+no;
			System.out.println("enter no");
			no=ip.nextInt();

			
		}while(no>0);
		System.out.println("sum"+ sum);
		ip.close();

	}

}
