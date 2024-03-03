package t3_while;

// 1~100까지의 홀수의 합, while
public class Test03a {
	public static void main(String[] args) {
		int i = -1, tot = 0;
		
		while (i < 99) { //범위도 홀수로 수정
			i = i + 2;
			tot = tot + i;
		}
		
		System.out.println("1에서 100까지의 홀수의 합은?   " +tot);
	}
}
