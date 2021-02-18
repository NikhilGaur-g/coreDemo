import java.util.Scanner;

public class Sumseries {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i=1;
		int sum=0;
		
		System.out.println("enter no");
		int no=ip.nextInt();
		for(i=1;i<=no;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is"+ sum);
		ip.close();

	}
	

}
