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

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int code;
		String jikkub;
		
		System.out.print("직급 코드를 입력하세요!(1:부장, 2:과장, 3:대리, 4:사원)  ");
		code = sc.nextInt();
		
		if(code == 1) {
			jikkub = "부장";
		}
		else if(code == 2) {
			jikkub = "과장";
		}
		else if(code == 3) {
			jikkub = "대리";
		}
		else if(code == 4) {
			jikkub = "사원";
		}
		else {
			jikkub = "비사원";
		}
		
		System.out.println("입력하신 직급 코드 "+code+"는 직급 "+jikkub+"입니다.");
		
		
		int hour = 0;
		
		System.out.print("시간수당의 시간을 입력하세요.  ");
		hour = sc.nextInt();
		
		int sudang = hour * 25000;
		
		System.out.println("시간 수당은 "+sudang+" 입니다.");
		
		
	  //공제액(gongje) : (본봉(bonbong) + 수당(sudang))의 10%로 한다.
	/*	
		int bonbong = 1:50000;
		double gongje = (bonbong + sudang) * 0.9;
		
		int netpay = bonbong + sudang - gongje;
		
		System.out.println("실수령액은 "+netpay+" 입니다.");
	*/			
				
		
		
		
		
		sc.close();		
	}
}
