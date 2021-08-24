package que15;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m");
		int m=sc.nextInt();
		System.out.println("Enter n");
		int n=sc.nextInt();
		int i=1;
		System.out.println("The multiplication of "+m+" table is");
		while(i<=n) {
			System.out.println(m+"*"+i+"="+m*i);
			i++;
		}
		
		
	}

}
