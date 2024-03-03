package t1_if;

import java.util.Scanner;

//두 개의 수를 입력 받아 두 수를 교환하시오
public class Test01b {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요~!  ");
		num1 = sc.nextInt();
		
		System.out.println("두번째 수를 입력하세요~!  ");
		num2 = sc.nextInt();
		
		System.out.println("입력된 첫번째 수: "+num1+" , 두번째 수 : "+num2);

		//두 수의 교환
		temp = num1; //temp : = 하나만 작성
		num1 = num2;
		num2 = temp;
		
		System.out.println("교환된 첫번째 수: "+num1+" , 두번째 수 : "+num2);
		
		
		sc.close();
		
		
	}
}