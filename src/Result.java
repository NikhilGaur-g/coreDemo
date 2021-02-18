import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		int math,phy,chem,eng,os;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name");
		 String name = sc.nextLine();
		
		System.out.println("enter math no.");
		 math = sc.nextInt();
		 
		 System.out.println("enter phy no.");
		 phy = sc.nextInt();
		 
		 System.out.println("enter chem no.");
		 chem = sc.nextInt();

		 System.out.println("enter eng no.");
		 eng = sc.nextInt();
		 
		 System.out.println("enter os no.");
		 os = sc.nextInt();
		 
		 float res =(float) (math+ phy+chem+eng+os)/500;
		 float result =(float) res*100;
		 System.out.println("Result"+ result);
		 System.out.println("student name:"+ name);
		 
		 if(result>=90)
		 {
			 System.out.println("honours");
		 }
		 else if(result>=65 && result<90)
		 {
			 System.out.println("first div");
			 
		 }
		 else if(result>=55 && result<65)
		 {
			 System.out.println("second div");
			 
		 }
		 else 
		 {
			 System.out.println("not good");
			 
		 }
		 
		 
		 
		 
		 
		 sc.close();
		 
	}

}
