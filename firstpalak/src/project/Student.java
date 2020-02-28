package project;
import java.io.*;
public class Student {
  String reg_id;
  String name;
  String marks;
  public String getReg_id() {
	return reg_id;
}

public void setReg_id(String reg_id) {
	this.reg_id = reg_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMarks() {
	return marks;
}

public void setMarks(String marks) {
	this.marks = marks;
}


  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Student()throws IOException{
	  
	  System.out.println("enter registration id: ");
	  reg_id =br.readLine();
	  System.out.println("enter name");
       name=br.readLine();
       
       System.out.println("enter marks : ");
      Float marks=Float.parseFloat(br.readLine());
      
  }
       	  
  void disp() {
	  System.out.println("Reg_id="+reg_id+""+"Name="+name+""+"Marks="+marks);
  }
  
	//public static void main(String[] args)throws IOException {
		//System.out.println("enter details of first student: ");
		//Student s1=new Student();
		//System.out.println("enter detail of second student: ");
		//Student s2=new Student();
		//System.out.println("enter detail of third student: ");
		//Student s3=new Student();
		
	//System.out.println();
		//System.out.println("detail of first student : ");
		//s1.disp();
		//System.out.println("details of second student : ");
		//s2.disp();
		//System.out.println("details of third student : ");
		//s3.disp();

//}
}