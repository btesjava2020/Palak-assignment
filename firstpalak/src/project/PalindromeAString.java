package project;

import java.util.Scanner;

public class PalindromeAString {

	public static void main(String[] args) {

String rev="";
Scanner sc=new Scanner(System.in);
System.out.println("enter a input string");
String org=sc.nextLine();
for(int i=org.length()-1;i>=0;i--) {
	rev+=org.charAt(i);
}
if(org.equals(rev)) {
	System.out.println("given string is a palindrome");
}
else {
	System.out.println("given string is not a palindromes");
}
	}

}
