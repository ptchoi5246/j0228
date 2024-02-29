package exam;

import java.util.Scanner;

/*
3번 : 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되,
한줄에 5개씩 출력하는 프로그램을 만드시오.(음수도 고려하시오)
// /t 제어 키 사용
 */

public class Test3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, cnt = 0; // 수를 입력 받는 변수 su 5개 출력 cnt
		
		System.out.print("두 자리 수를 입력하세요~!  ");
		su = sc.nextInt();
		
		if (su >= 10) {
		//양수일 때 처리
			while(su >= 1) { //반복문 1이 될 때까지 :: su >= 1 :: ex. 10이 1이 될 때까지;
		}
			System.out.print(su + "\t"); //su가 감소되기 전에 출력, 가로 출력으로 ln 지우기, (su + " ") : su 뒤에 한칸 띄우기 = "\t"
			su--; //거꾸로 1이 될 때까지			
			cnt++;
			if(cnt % 5 == 0 ) { //5개씩 출력
					System.out.println();
			}
		}	
		
		//음수일 때 처리 !!소스 복사해오기
		if(su <= -10) {
			while(su <= 1) {
				System.out.print(su + "\t");
				su++;
				cnt++;
				if(cnt % 5 == 0) System.out.println();
			}
		}		
		sc.close();		
	}
}
