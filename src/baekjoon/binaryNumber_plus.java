package baekjoon;

public class binaryNumber_plus {

	public static void main(String[] args) {
		String bin1="1101";
		String bin2="1010";
		String answer = "";
		
		int bin1_10 = 0;
		int bin2_10 = 0;
		int two_1 = 1;
		int two_2 = 1;
		int size_1 = bin1.length()-1;
		int size_2 = bin2.length()-1;
		
		//10진수로 변환
		for(int i=size_1; i>=0; i--) {
			int s = Character.getNumericValue(bin1.charAt(i));
			bin1_10 +=(s)*two_1;
			two_1 *= 2;
		}
		
		for(int i=size_2; i>=0; i--) {
			int s = Character.getNumericValue(bin2.charAt(i));
			bin2_10 +=(s)*two_2;
			two_2 *= 2;
		}
		
		int value = bin1_10 + bin2_10;
		//2진수로 변환
		String value_b = "";
		while(value!=0) {
			int n = 0;
			value_b += Integer.toString(value%2);
			value /= 2;
		}
		
		for(int i=value_b.length()-1; i>=0; i--) {
			answer += value_b.charAt(i);
		}
		
		
		if(bin1.equals("0")&&bin2.equals("0")) answer = "0";
		System.out.println(answer);
	}

}
