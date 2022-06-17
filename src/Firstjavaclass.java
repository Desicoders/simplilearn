
public class Firstjavaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		st1.name="Sudha";
		st1.rollno=123;
		System.out.println(st1.name);
        Student st2=new Student("Sherayansh",124,"FSD");
        st2.name="Bhuwan";
        st2.attendSession();
	}

}
class Student{
	String name;
	int rollno;
	String courseEnroled;
	//parameterized constructor
	Student(String name,int rollno,String courseEnroled){
		this.name=name;
		this.rollno=rollno;
		this.courseEnroled=courseEnroled;
	}
	//no args constructor
	Student(){
		System.out.println("constructor called");
	}
	
	int sumOfTwoNumbers(int x,int y) {
		
		int z=x+y;
		return z;
	}
	
	void attendSession(){
		System.out.println("attend session has been called");
	}
	
	
	void leaveSession() {
		//leave course by clicking on leave session
		
	}
	
	void askQuestions() {
		
	}
	
}