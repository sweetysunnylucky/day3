package que7;

import java.util.Scanner;

public class KaprekarNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,i,d=0,s=0,f,l;
		a=sc.nextInt();
		for(i=a;i>0;i=i/10) {
			d++;
		}
		s=a*a;
		f=s/(int)Math.pow(10, d);
		l=s%(int)Math.pow(10,d);
		if(f+l==a) {
			System.out.println("Kaprekhar Number");
		}
		else {
			System.out.println("Not a Kaprekhar Number");
		}
	}

}
