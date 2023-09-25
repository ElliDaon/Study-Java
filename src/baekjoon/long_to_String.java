package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class long_to_String {


	public static void main(String[] args) throws IOException {
		long n = 118372;
		long answer = 0;
		
		String n_s = String.valueOf(n);
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<n_s.length(); i++) {
			list.add(String.valueOf(n_s.charAt(i)));
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		n_s = String.join("", list);
		answer = Long.parseLong(n_s);
		System.out.println(answer);
	}
}
