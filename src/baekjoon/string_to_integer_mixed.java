package baekjoon;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

public class string_to_integer_mixed {
	public static void main(String[] args) throws IOException {
		String s = "2three45sixseven";
		String value = "";
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		
		String st = "";
		Queue<Character> queue = new LinkedList<>();
		for(int i=0; i<s.length(); i++) {
			queue.add(s.charAt(i));
		}
		while(!queue.isEmpty()) {
			st += queue.poll();
			int a = 0;
			try{
				a = Integer.parseInt(st);
				value += st;
				st="";
			}catch(Exception e) {
				if(map.containsValue(st)) {
					int b = 0;
					for(Entry<Integer, String> entry : map.entrySet()) {
						if(entry.getValue().equals(st)) {
							b = entry.getKey();
							break;
						}
					}
					value += Integer.toString(b);
					st="";
				}
			}
			
		}
		int answer = Integer.parseInt(value);
		System.out.println(value);
	}
}
