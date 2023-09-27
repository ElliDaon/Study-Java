package baekjoon;

import java.io.IOException;

public class char_Caesar_cipher {
	public static void main(String[] args) throws IOException {
		String s = "a B z";
		int n = 4;
		n %= 26;
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ')
				c=' ';
			else if (c >= 97 && c <= 122) {
				if (c + n > 122) {
					c+=n;
					c-=26;
				}else {
					c+=n;
				}
			}else if(c>=65 && c<=90) {
				if (c + n > 90) {
					c+=n;
					c-=26;
				}else {
					c+=n;
				}
			}
			answer += c;
		}

		System.out.println(answer);
	}
}
