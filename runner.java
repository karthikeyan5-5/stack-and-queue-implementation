package demo3;

import java.util.Scanner;

public class runner {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack <Object> stack1=new Stack<>();
		
		boolean check=true;
		while(check) {
		System.out.println("1.push\n2.pop\n3.peek\n4.length\n5.display\n6.end");
	 switch( sc.nextInt()) {
	 case 1:
		 System.out.println("enter the element to push");
		// sc.nextLine();
		 Object a=sc.next();
	     stack1.push(a);
//	     stack1.displayStack();
	     break;
	 case 2:
		 stack1.pop();
//	     stack1.displayStack();
	     break;
	 case 3:
		 System.out.println("peek="+stack1.peek());
		 break;
	 case 4:
		 System.out.println("size="+stack1.size());
		 break;
	 case 5:
		 stack1.displayStack();
		 
		 break;
	 case 6:
		 check=false;
		 break;
	 default:
		 System.out.println("invalid input");
		 break;
	 }}	
	}
}
