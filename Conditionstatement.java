package java_project;
import java.util.Scanner;

public class Conditionstatement {
	public static void main (String [] args) {
	 char grade ;
	 Scanner sc = new Scanner (System.in);
	 System.out.println("enter");
		
	 grade =sc.next().charAt(0);
	 
	 System.out.println(grade);
	 
	 switch (grade)
	 {
	 case 'a':
		 System.out.println("appriciate hime or her");
		 break ;
		 
	 case 'b':
		 System.out.println("good to go");
		 break;
	 case 'c':
		 System.out.println("padi da parama ");
		 break;
		 
	default :
		System.out.println("program mudinchu!!!");
	 }
	
	}
	
	

}
