package t2_switch_case;

import java.util.Scanner;

//점수를 입력받아 학점을 구하시오. 90점 이상은 'A' ...
//switch, case 사용
public class Test04_2a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum = 0;
		char gr;
		
		System.out.print("점수를 입력하세요~!  ");
		jum = sc.nextInt();
				
			switch (jum / 10) {
				case 10:
				case 9:
					gr = 'A';
				case 8:
					gr = 'B';
				case 7:
					gr = 'C';
				case 6:
					gr = 'D';
					break;
				default:
					gr = 'F';					
			}
			
		System.out.println("점수 "+jum+"점은 "+gr+" 입니다.");
	
		sc.close();
	}
}