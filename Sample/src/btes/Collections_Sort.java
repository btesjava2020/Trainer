package btes;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Sort {

    public static void main(String[] args)throws IOException {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
       
    ArrayList<Student> ar=new ArrayList<Student>();   
    ar.add(s1);
    ar.add(s2);
    ar.add(s3);
    
    MarksComparator m=new MarksComparator();
	
	Collections.sort(ar,m);
	
	for(Student s:ar){
		s.disp();
	}
	
	
}
