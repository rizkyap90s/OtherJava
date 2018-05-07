package StackOOP;

import java.util.Scanner;

class stack{
	private int index;
	private int [] M;
	public int top;
	public stack() {
		index = 10;
		M = new int [index];
		top = 0;
	}
	public void pushdata(int x) {
		top = top +1;
		M[top]=x;
	}
	public void popdata(int t) {
		System.out.println("Keluar = "+M[t]);
		top = top - 1;
	}
}

public class Stackku{

	public static void main(String[]args) {
		stack s =new stack();
		s.pushdata(100);
		s.pushdata(10);
		s.pushdata(1);
		s.popdata(s.top);
		s.popdata(s.top);
	}
}