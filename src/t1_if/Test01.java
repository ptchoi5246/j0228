package t1_if;

import java.util.Scanner;

// 두개의 수를 교환
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2, temp;
		
		System.out.print("첫번째 수를 입력하세요!  ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요!  ");
		su2 = sc.nextInt();
		
		System.out.println("입력된 수 su1 : "+su1+" , su2 : " + su2);
		
		//두 수의 교환
		temp = su1;
		su1 = su2;
		su2 = temp;
		
		System.out.println("교환된 수 su1 : "+su1+" , su2 : " + su2);
		
				
		sc.close();
	}
}


/*알고리즘 - 사진
 * A = 100 B = 200
 * B=A A=100, B=100 
 * A=B A=100, B=100 :: 값을 덮어쓰게 된다.
 * T 템프 =/ 값을 교환한다
 * A = 100 B = 200 T 템프
 * B -> T A->B T->A
 * 
 * T=B
 * B=A
 * A=T
 * T=B; B=A; A=T;*/
 