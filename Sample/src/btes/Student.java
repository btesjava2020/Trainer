package btes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	//instance variables
	private String reg_id;
	
	private String name;
	private float marks;
	static String college="";
	
	
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	public String getReg_id() {
		return reg_id;
	}
	public String getName() {
		return name;
	}
	public float getMarks() {
		return marks;
	}
	public static String getCollege() {
		return college;
	}

	static {
		college="YPS";
		System.out.println("Welcome to static block");
	}

	Student(String reg, String na,float marks){
		this(10);
		reg_id=reg;
		name=na;
		this.marks=marks;
		
	}
	Student(){
		
	}
	
	public Student(int i) {
		// TODO Auto-generated constructor stub
	}
	void Student()
	{
		
	}

	//instance methods
	public void disp() {
		System.out.println("Reg_Id="+reg_id+" "+"Name="+name+" "+"Marks="+marks);
		this.name="";
	}
	//static method
	static void cal_highest() {
	int highest;
	//college="PIMT";
		
		
	
	}
	
	
	
//	public static void main(String[] args)throws IOException {
//		int i;String reg, name;float marks;
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(college);
//		
//		
//		//Array of Objects
//		Student[] stu=new Student[5];
//		for(i=0;i<stu.length;i++) {
//		System.out.println("Enter RegId");
//		reg=br.readLine();
//		System.out.println("Enter name");
//		name=br.readLine();
//		System.out.println("Enter marks");
//		marks=Float.parseFloat(br.readLine());
//		stu[i]=new Student(reg,name,marks);
//		}
//		for(i=0;i<stu.length;i++) {
//		stu[i].disp();
//		System.out.println(stu[i].name);
//		}
//		
//		
//		
//		
//		
//
//	}

}
