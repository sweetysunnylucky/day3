package que2;
import java.util.Scanner;
public class FactorialNumber {
	public static void main(String[] args) {
		int n,i,fact=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<n;i++) {
			fact=fact*i;
			if(n==fact) {
				fact=1;
				break;
			}
		}
		if(fact==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
			
		
		
	}

}
