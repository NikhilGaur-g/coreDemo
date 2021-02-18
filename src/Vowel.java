import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		char c ;
		Scanner sc = new Scanner(System.in);
		c=sc.next().charAt(0);
		if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("not vowel");
		}
sc.close();
	}

}
