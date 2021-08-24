package que5;
import java.util.Scanner;
public class OddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int a,count=0;
		 float b=0;
		  do {
			  a=sc.nextInt();
			  if(a<0) {
					 b=(float)(b-1.0);
				 }
			  else if(a%2==0) {
					 count++;
					 b++;
				 }
				 else {
					 b=(float)(b-0.5);
				 }
				 System.out.printf("%.1f",+b);
			 }
			 while(a>0&&count!=3);

}
}