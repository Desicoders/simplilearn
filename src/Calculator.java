
public class Calculator {
   public static void main(String[] args) {
	Calci obj=new Calci();
	int result=obj.multiply(2, 3);
	int result1=obj.multiply(2);
	System.out.println(result);
	System.out.println(result1);
}
}
class Calci{
	
	int sum(int num1,int num2) {
		return num1+num2;
	}
	int multiply(int num1,int num2) {
		return num1*num2;
	}
	int multiply(int num1) {
		return num1*num1;
	}
	int difference(int num1,int num2) {
		return num1-num2;
	}
}