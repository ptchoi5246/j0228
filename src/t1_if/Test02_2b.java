package t1_if;

// 논리 연산자 (!not, &&and, ||or)
public class Test02_2b{
	public static void main(String[] args) {
		int num1 = 50, num2 = 20, num3 = 35, max = -99;
		
		if (num1 > num2 && num1 > num3) {
			max = num1;				
			}	
			else if (num2 > num3) { //else에 num1 < num2 의미가 있으니 굳이 쓸 필요가 없다
				max = num2;
			}		
		else max = num3;
			
		
		System.out.println("첫번째 숫자 : "+num1+" , 두번째 숫자 : "+num2+" , 세번째 숫자 : "+num3+" , 최대값 : " +max);
	}	
}

