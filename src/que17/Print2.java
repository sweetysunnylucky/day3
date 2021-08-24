package que17;

import java.util.Scanner;

public class Print2 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		while(a>=b) {
			System.out.println(a);
			a--;
		}
	}

}
