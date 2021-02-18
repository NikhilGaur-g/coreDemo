import java.util.Scanner;

public class Employee {

	public static void main(String[] args) 
	{
		int hra,da,basic,net,pf;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name");
		 String name = sc.nextLine();
		
		 System.out.println("enter passkey");
		 String passkey = sc.nextLine();
		
		System.out.println("enter basic salary");
		 basic = sc.nextInt();
		 
		 System.out.println("hra");
		 hra = sc.nextInt();
		 
		 System.out.println("da");
		 da = sc.nextInt();

		 System.out.println("enter pf");
		 pf = sc.nextInt();
		 
		 
		 net =(hra+da+basic)-pf;
		 
		 System.out.println("employee name:"+" "+ name);
		 System.out.println("employee passkey:"+" "+passkey );
		 System.out.println("net salary is"+" "+ net);

         sc.close();

	}

}
