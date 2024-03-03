package t1_if;

import java.util.Scanner;

//직급코드를 입력받아서 직급별 명칭을 출력하시오.
/*
  직급코드 1 : 부장, 본봉 : 5000000
  직급코드 2 : 과장, 본봉 : 4000000 
  직급코드 3 : 대리, 본봉 : 3000000
  직급코드 4 : 사원, 본봉 : 2000000
  
  시간수당(sudang) : 시간을 입력받아서 1시간당 25000원으로 계산 한다. 
  공제액(gongje) : 본봉(bonbong) + 수당(sudang)의 10%로 한다.
  실수령액(netpay)를 구하시오.
  
  단, 실수령액 = 본봉 + 수당 - 공제액
 */

public class Test05_1a {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		int jik = 0, bonbong = 0, time = 0, sudang = 0;
		double gongje = 0, netpay = 0;
		
		System.out.println("직급 코드를 입력하세요~!  (직급코드 1 : 부장, 2 : 과장, 3 : 대리, 4 : 사원) ");
		jik = sc.nextInt();
		
		if (jik == 1) bonbong = 5000000;
		if (jik == 2) bonbong = 4000000;
		if (jik == 3) bonbong = 3000000;
		if (jik == 4) bonbong = 2000000;
				
		System.out.println("직급코드 "+jik+"은 본봉 "+bonbong+"원 입니다.");
		
		
		System.out.println("수당의 시간을 입력하세요");
		time = sc.nextInt();
		
		sudang = (time * 25000);
		
		System.out.println("당신의 수당은 "+sudang+"원 입니다");
		
		gongje = ((bonbong + sudang) * 0.1);
		 
		netpay = bonbong + sudang - gongje;
		
		System.out.println("당신의 실수령액은 "+netpay+" 원 입니다.");
		
		sc.close();
				
		
		
		
	}
	
}

