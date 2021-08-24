package que1;
import java.util.Scanner;
public class AmoebaMultiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b=0,c=1,d=0;
		System.out.println("Enter the no of months:");
		a=sc.nextInt();
		for(int i=2;i<a;i++) {
			d=b+c;
			b=c;
			c=d;
		}
		System.out.println("The amoeba size is "+d);
		
	}

}
