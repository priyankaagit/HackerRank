package dataStructures;
import java.util.*;
public class JavaPriorityQueue {
	class Student{
		   private int token;
		   private String fname;
		   private double cgpa;
		   public Student(int id, String fname, double cgpa) {
		      super();
		      this.token = id;
		      this.fname = fname;
		      this.cgpa = cgpa;
		   }
		   public int getToken() {
		      return token;
		   }
		   public String getFname() {
		      return fname;
		   }
		   public double getCgpa() {
		      return cgpa;
		   }
		}

	class Checker implements Comparator<Student>{
		public int compare(Student a, Student b){
			if(a.getCgpa() > b.getCgpa())
				return -1;
			else if(a.getCgpa()<b.getCgpa())
				return 1;
			else if(a.getCgpa() == b.getCgpa())
				return(a.getFname().compareTo(b.getFname()));
			else
				return((Integer)a.getToken()).compareTo(b.getToken());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	      int totalEvents = Integer.parseInt(in.nextLine());
	      JavaPriorityQueue jp = new JavaPriorityQueue();
	      Checker checker = jp.new Checker();
	      PriorityQueue<Student> stud = new PriorityQueue<Student>(totalEvents,checker);	      
	      while(totalEvents>0){
	         String event = in.next();
	            if(event.equals("ENTER")){
	            	String name = in.next();
	            	Double cgpa = in.nextDouble();
	            	int token = in.nextInt();
	            	Student s = jp.new Student(token,name,cgpa);
	            	stud.add(s);
	            	//Collections.sort(stud,checker);	            		            	
	            }
	            else if(event.equals("SERVED")){
	            	stud.poll();
	            }	           
	         totalEvents--;
	      }
	      if(stud.isEmpty()){
	    	  System.out.println("EMPTY");
	      }
	      else{
	    	  while(!stud.isEmpty()){
                  Student s = stud.remove();
                  String n = s.getFname();
	    		  System.out.println(n);
	    	  }
	      }

	}

}

