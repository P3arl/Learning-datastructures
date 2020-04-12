package com.p3arl.ds.stack;

public class App {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
//		stack.push(20);
//		stack.push(40);
//		stack.push(60);
//		stack.push(80);
		
//		while(!stack.isEmpty()) {
//			long value = stack.pop();
//			System.out.println(value);
//		}
		
		System.out.println(reverseString("HELLO"));
	}
	
	public static String reverseString(String str) {
		int stackSize = str.length();
		Stack charStack = new Stack(stackSize);
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			charStack.push(ch);
		}
		String result = "";
		while(!charStack.isEmpty()) {
			char ch = charStack.pop();
			result = result + ch;
		}
		return result;
	}
}
