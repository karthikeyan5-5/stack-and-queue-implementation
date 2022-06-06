package demo3;

import java.util.Scanner;

public class runner1 {
 public static void main(String[] args){
		// TODO Auto-generated constructor stub
		
	
			Scanner sc=new Scanner(System.in);
			queue <Object> queue1=new queue<>();
			
			boolean check=true;
			while(check) {
			System.out.println("1.enqueue\n2.dequeue\n3.peek\n4.length\n5.display\n6.end");
		 switch( sc.nextInt()) {
		 case 1:
			 System.out.println("enter the element to enqueue");
	
			 Object a=sc.nextInt();
			queue1.enQueue(a); 
		    queue1.displayQueue();
		     break;
		 case 2:
			 queue1.deQueue();
		     
		     break;
		 case 3:
			 System.out.println("peek="+queue1.peek());
			 break;
		 case 4:
			 System.out.println("size="+queue1.size());
			 break;
		 case 5:
			 queue1.displayQueue();
			 
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
