package dataStructures;
import java.util.*;

class Checker implements Comparator<Student>{
	public int compare(Student a, Student b){
		if(a.getCgpa()>b.getCgpa())
			return -1;
		else if(a.getCgpa()<b.getCgpa())
			return 1;
		else if(a.getCgpa() == b.getCgpa()){
			if(a.getFname().compareTo(b.getFname()) == 0)
			     return  ((Integer) a.getId()).compareTo(b.getId());
			else 
				return a.getFname().compareTo(b.getFname());
		}			 
		return 0;
	}
}
class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }	         
	         Checker checker = new Checker();	         
	         Collections.sort(studentList,checker);
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }

	}

}
