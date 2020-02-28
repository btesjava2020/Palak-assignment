package project;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr;
int i,j,k,temp;
arr=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("element in an array");
for(i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
	for(j=0;j<=i;j++) {
		if(arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;}}
	for(k=0;k<arr.length;k++) {
		System.out.println(arr[k]+ "\t");
		}
	}
}

	}


