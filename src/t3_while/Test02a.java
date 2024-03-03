package t3_while;

// 1~100까지의 짝수의 합, while
public class Test02a {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while (i < 100) {
			i = i+2;
			tot = tot + i;
		}
		
		System.out.println("1에서 100까지의 짝수합은?   " +tot);
	}
}
