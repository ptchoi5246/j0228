package t3_while;

// 1~100까지의 합, while
public class Test01a {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while (i < 100) {
			i = i+1;
			tot = tot + i;
		}
		
		System.out.println("1에서 100까지의 합은?   " +tot);
	}
}
