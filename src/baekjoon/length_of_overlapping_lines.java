package baekjoon;

import java.io.IOException;
import java.util.Arrays;

public class length_of_overlapping_lines {
	public static int[] pull(int[] a,int x, int y, int max){
		for(int i=0; i<max; i++) {
			if(i>=x&&i<y) {
				a[i]=1;
			}
		}
		
		return a;
	}

	public static void main(String[] args) throws IOException {
		int[][] lines = {{3,9},{2,10},{10,12}};
		int answer = 0;
		Arrays.sort(lines, (o1, o2)->{
			return o1[0] - o2[0];
		});
		//점의 최소값
		int min = lines[0][0];
		Arrays.sort(lines, (o1, o2)->{
			return o2[1]-o1[1];
		});
		//점의 최대값
		int max = lines[0][1];
		
		//0과의 차이
		int bt = 0-min;
		//최소를 0으로 맞춰서 다 땡긴다
		for(int i=0; i<3; i++) {
			lines[i][0] += bt;
			lines[i][1] += bt;
		}
		min += bt;
		max += bt;
		
		int[] line1 = new int[max];
		int[] line2 = new int[max];
		int[] line3 = new int[max];
		
		line1 = pull(line1,lines[0][0],lines[0][1],max);
		line2 = pull(line2,lines[1][0],lines[1][1],max);
		line3 = pull(line3,lines[2][0],lines[2][1],max);
		
		for(int i=0; i<max; i++) {
			System.out.print(line1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<max; i++) {
			System.out.print(line2[i]+" ");
		}
		System.out.println();
		for(int i=0; i<max; i++) {
			System.out.print(line3[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<max; i++) {
			int count = 0;
			if(line1[i]==1) count++;
			if(line2[i]==1) count++;
			if(line3[i]==1) count++;
			
			if(count>1) answer++;
		}
		System.out.println(answer);
	}
}
