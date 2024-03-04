package t3_while;

// 1~100까지의 홀수합/짝수합(Switching 기법을 활용하기) :: 하나 나눠주고 다른 하나 나눠주고
public class Test10a {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		int odd = 0, even = 0, sw = 0;
		//sw = 0, if(sw==00) odd, sw=1, (sw==1) even
		
		while(i<100) {
			i++;
			if(sw==0) {
				odd += i;
				sw = 1;
			}
			else {
				even += i;
				sw = 0;
			}			
		}
		System.out.println("1 ~ 100까지의 홀수합은? " + odd);
		System.out.println("1 ~ 100까지의 짝수합은? " + even);
	}
}
