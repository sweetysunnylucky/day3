package que9;
import java.util.Scanner;
public class DataMining {
	public static void main(String[] args) {
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0) {
		if((n%10)%2==0) {
				even=even+(n%10);
			}
			else {
				odd=odd+(n%10);
			}
			n=n/10;
		}
		if(even==odd) {
			System.out.println("Yes");
		}
		else {
			System.out.println("N0");
		}
	}

}
