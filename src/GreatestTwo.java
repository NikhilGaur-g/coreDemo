import java.util.Scanner;
public class GreatestTwo {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two no.");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 if(a>b)
		 {
			 System.out.println("a is great");
		 }
		 else
		 {
			 System.out.println("b is great");
		 }
		sc.close();
		

	}

}
