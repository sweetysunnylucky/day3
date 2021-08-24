package que10;
import java.util.Scanner;
public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int f,l,sum,product;
		f=num/10;
		l=num%10;
		sum=f+l;
		product=f*l;
		if((sum+product)==num) {
			System.out.println("Special Number");
		}
		else {
			System.out.println("Not a Special Number");
		}
	}

}
