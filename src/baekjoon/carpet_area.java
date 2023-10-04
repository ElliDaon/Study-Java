package baekjoon;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class carpet_area {
	public static void main(String[] args) throws IOException {
		int brown = 10;
		int yellow = 2;
		int[] answer = new int[2];
		int n = brown + yellow;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		HashMap<Integer, Integer> map = new HashMap<>(); //전체 면적이 될 수 있는 경우의 수
		HashMap<Integer, Integer> map2 = new HashMap<>(); //노란색 면적이 될 수 있는 경우의 수

		for(int i=1; i<=yellow; i++) {
			if(yellow%i==0) {
				map2.put(i, yellow/i);
			}
		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				map.put(i, n / i);
			}
		}
		System.out.println("노란색 면적");
		for(Entry<Integer, Integer> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		System.out.println("전체 면적");
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			int w = entry.getKey();
			int h = entry.getValue();
			for(Entry<Integer, Integer> entry2 : map2.entrySet()) {
				int w2=entry2.getKey();
				int h2=entry2.getValue();
				int yn = w2*h2;
				int b2 = ((w2+2)*2)+(h2*2);
				w2=w2+2;
				h2=h2+2;
				System.out.println("b2:"+b2);
				if(w>=h&&b2==brown&&w>=w2&&h>=h2&&w2>=h2) {
					answer[0]=w;
					answer[1]=h;
					System.out.println(w+" "+h+" "+w2+" "+h2);
				}
			}
		}
		
		
		System.out.println(answer[0]+ " " + answer[1]);
	}
}
