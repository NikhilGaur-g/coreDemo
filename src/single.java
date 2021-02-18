import java.util.Scanner;

public class single {

	public static void main(String[] args) {
		int a ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		
		a = sc.nextInt();
		
    	if(a>=-9 && a<=9 )
		{
			System.out.println("single");
		}
    	else
		{
			System.out.println("not single");
		}
		sc.close();

	}

}
