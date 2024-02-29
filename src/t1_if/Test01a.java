package t1_if;

import java.util.Scanner;

// 두개의 수를 교환
public class Test01a {
	public static void main(String[] args) {
		
		int su1, su2, temp;
		
		//수를 입력받는다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해주세요!  ");
		su1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력해주세요!  ");
		su2 = sc.nextInt();
		
		System.out.println("첫번째 숫자 : "+su1+", 두번째 숫자 : "+su2+"");
		
		//두 수의 교환
		
		temp = su1;
		su1 = su2;
		su2 = temp;
		
		System.out.println("교환된 수 su1 : "+su1+", su2 " +su2);
		
		//temp를 통해서 수를 교환했기 때문에 su1, su2 그대로 입력
	
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
 