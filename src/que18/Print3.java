package que18;

import java.util.Scanner;

public class Print3 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a<=b) {
			while(a<=b) {
				System.out.println(a);
				a++;
			}
		}
			else {
				while(a>=b) {
					System.out.println(a);
						a--;
				}
		
		}
	}

}
