package t1_if;

import java.util.Scanner;

//점수를 입력받아 학점을 구하시오. 90점 이상은 'A' ...
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jum = 0;
		char gr;
		
		System.out.print("점수를 입력하세요!  ");
		jum = sc.nextInt();
		
		if(jum >= 90) gr = 'A';
		else if(jum >= 80) gr = 'B';
		else if(jum >= 70) gr = 'C';
		else if(jum >= 60) gr = 'D';
		else gr = 'F';
		
		System.out.println("점수 "+jum+"은 학점 "+gr+" 입니다.");
		
		sc.close();		
	}
}
