import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
System.out.println("enter a number");
int no=s.nextInt();
int c;
for(int i=1;i<=10;i++)
{
    c=no+n;
   
	System.out.println(c);
	no=n;
	n=c;
}
  }

}
