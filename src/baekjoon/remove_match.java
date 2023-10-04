package baekjoon;

import java.io.IOException;
import java.util.Stack;

public class remove_match {
	public static void main(String[] args) throws IOException {
		String s = "baabaa";
		String[] st = s.split("");
		for(int i=0; i<st.length; i++) {
			System.out.print(st[i]+" ");
		}
		System.out.println();
		Stack<String> stack = new Stack<>();
		int answer = 0;
		for(String n : st) {
			if(!stack.isEmpty()&&stack.peek().equals(n)) {
				stack.pop();
				System.out.println("pop: "+stack.toString());
			}else {
				stack.add(n);
				System.out.println("add: "+stack.toString());
			}
		}
		
		if(stack.size()==0) answer = 1;
		System.out.println(answer);
	}
}
