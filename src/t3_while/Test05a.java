package t3_while;

// 1~100까지의 합 10항씩의 합을 출력하시오.
/*
   1 ~ 10 : 55
   11 ~ 20 : 
   21 ~ 30 : 
   31 ~ 40 : 
   41 ~ 50 : 
   51 ~ 60 : __ 
   61 ~ 70 : __ 
   71 ~ 80 : __ 
   81 ~ 90 : __ 
   91 ~ 100 : 
 */
public class Test05a {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while(i < 100) {
			i = i + 1;
			tot = tot + i;
			if((i % 10) == 0) { 
				System.out.println((i-9) + " ~ "+i+" 합은 "+tot+" 입니다."); // 다음항의 첫숫자가 마지막 숫자 다음 숫자라 i-9
				tot = 0; //합계 리셋 tot clear
			}
		}
	}
}
