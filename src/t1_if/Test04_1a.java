package t1_if;

import java.util.Scanner;

//점수를 입력받아 학점을 구하시오. 90점 이상은 'A' ...
public class Test04_1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum = 0;
		String str = ""; //문자열이기에 char gr = ''; 사용
		
		System.out.print("점수를 입력하세요~!  ");
		jum = sc.nextInt();
				
			if (jum >= 90) str = "A";
			else if (jum >= 80) str = "B";
			else if (jum >= 70) str = "C";
			else if (jum >= 60) str = "D";
			else str = "F";
		
		System.out.println("점수 "+jum+"점은 "+str+" 입니다.");
				
				
		
		sc.close();
	}

}