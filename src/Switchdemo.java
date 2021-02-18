import java.util.Scanner;
public class Switchdemo {

	public static void main(String[] args) {

		int a,b,res;
	    String op;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("enter op");
	     op=s.next();
	     
	     switch(op)
	     {
	     case "+": res=a+b;
	     System.out.println("add is:"+ res);
	     break;
	     
	     case "-": res= a-b;
	     System.out.println("sub:"+ res);
	     break;
	     

	     case "*": res= a*b;
	     System.out.println("mul:"+ res);
	     break;
	     
	     default:
	    	 System.out.println("invalid");
	    	 break;
	     
	     
	     
	     }
	     s.close();
	}

}
