import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class monotonic_Array {

	public static void main(String[] args)throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter elements of an array: ");
int n = Integer.parseInt(br.readLine());
int arr[]=new int[n];


System.out.println("enter elements of an array: ");
for(int i=0;i<=n-1;i++) {
	arr[i]= Integer.parseInt(br.readLine());	
}

for(int i=0;i<=n-1;i++) {
	System.out.println(" "+arr[i]);
}
monotonic(arr,n);

	}

	private static void monotonic(int[] arr, int num) {
		System.out.println();
		
		if(arr[0]<=arr[1]&& arr[num - 2] <= arr[num-1]) {
			System.out.println("entered element is monotonic");}
		else {
			System.out.println("entered element is not monotonic");
		}


		
	}

}
