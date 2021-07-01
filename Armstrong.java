import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		int temp=num;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=num;
		int sum=0;
		while(temp>0) {
			int n=temp%10;
			sum+=Math.pow(n,count);
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}