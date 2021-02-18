import java.util.Scanner;
public class GreatestThree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three no.");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.println("a is great");
		 }
		 else if(b>a && b>c)
		 {
			 System.out.println("b is great");
		 }
		 else
		 {
			 System.out.println("c is great");
		 }
		sc.close();
		

	}

}
