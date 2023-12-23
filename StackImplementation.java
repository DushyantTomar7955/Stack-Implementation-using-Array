package com.jspider;

import java.util.Arrays;
import java.util.Scanner;

class Stack{
	int stack[];
	int top;
	int size;
	Stack(int size){
		stack=new int[size];
		top=-1;
		this.size=size;		
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public void push(int data) {
		if(isFull())
			System.out.println("Stack Overflow");
		else {
			top++;
			stack[top]=data;
			System.out.println("Element Added Succesfully...");
		}
	}
	public void pop() {
		if(isEmpty())
			System.out.println("Stack Underflow");
		else {
			int data=stack[top];
			top--;
			System.out.println("Element Deleted Successfully....");
		}
	}
	public int peek() {
		if(top==-1)
			return -1;
		else
			return stack[top];
	}
	public String display() {
		String s="[";
		for(int i=0;i<top;i++) {
			s+=stack[i]+",";
		}
		s+=stack[top];
		return s+"]";
	}
	
}

public class StackImplementation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Size of Stack:");
	int n=sc.nextInt();
	Stack s=new Stack(n);
	boolean b=true;
	while(b) {
		System.out.println("=======================");
	System.out.println("Enter the choice: \n1.push\n2.pop.\n3.peek\n4.Full\n5.Empty\n6.Exit\n7.display");
	System.out.println("========================");
	int choice=sc.nextInt();
	switch(choice) {
	     case 1:{
	    	 System.out.print("Enter the data:");
	     
	         int data=sc.nextInt();
	         s.push(data);
	         break;
	     }
	         
	     case 2:{
	    	 s.pop();
	         break;
	     }
	     case 3: {
	    	 int peek=s.peek();
	     
	     System.out.println("Peak Element is: "+peek);
	     break;
	     }
	     case 4:{
	    	System.out.println( s.isFull());
	     break;
	     }
	     case 5:{
	    	 System.out.println(s.isEmpty());
	    	 break;
	     }
	     case 6:{
	    	 System.out.println("Exiting....");
	     b=false;
	     break;
	     }
	     case 7:{
	    	 if(s.top!=-1) {
	    	 System.out.println(s.display());
	    	 break;
	    	 }
	     }
	     default:System.out.println("Enter the right choice: ");
	}
	
	}

	

	}

}
