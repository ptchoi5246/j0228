package t3_while;

// 1-2+3-4+5-6+7-8+9-10=?
public class Test07b {
	public static void main(String[] args) {
		int i = 0, tot = 0, s = -1;  //s = 부호 첫번째 값이 양수이기 때문에 s의 초기값은 -1
		
		while(i<10) {
			i++;
			s = s * -1; //+- 로 갈때는 무조건 (* -1) 처음에 양수가 나와야 하니까 s의 초기값은 -1
			tot = tot + (i * s);
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10=? " +tot);
	}
}
