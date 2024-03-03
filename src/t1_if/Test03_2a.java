package t1_if;

import java.util.Scanner;

// 3과목의 점수를 입력받는다. 이때 3과목의 평균점수가 60점이상이고, 각 과목당 40점 이상이면 '합격', 그렇지 않으면 '불합격'
// 논리연산자 && 사용하기
public class Test03_2a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum1, jum2, jum3, avg;
		String str = " ";
		
		System.out.println("첫번째 과목 점수를 입력하세요~!  ");
		jum1 = sc.nextInt();
		System.out.println("두번째 과목 점수를 입력하세요~!  ");
		jum2 = sc.nextInt();
		System.out.println("세번째 과목 점수를 입력하세요~!  ");
		jum3 = sc.nextInt();
		
		avg = (jum1 + jum2 + jum3) / 3;
		
		if (avg >= 60 && jum1 >= 40 && jum2 >= 40 && jum3 >= 40) {
			str = "합격";
		}			
		else str = "불합격";
		
		System.out.println("당신은 "+str+" 입니다.");
				
		sc.close();		
	}
}