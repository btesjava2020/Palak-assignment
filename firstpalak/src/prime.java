import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
Scanner c =new Scanner(System.in);
	System.out.println("enter a new number");
int n = c.nextInt();
int i,temp =0;
for(i=2;i<=n-1;i++) {
	if(n%i==0) {
		temp=temp+1;
	}
	}
if(temp==0)
{
	System.out.println("number is prime");
	}
else
{
	System.out.println("number is not prime");




	}

	}
}
