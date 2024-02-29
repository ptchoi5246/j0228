package t3_while;

// 1~100까지의 홀수합
public class Test03 {
	public static void main(String[] args) {
		int i = -1, tot = 0; //누적값은 건들지 않는다.
		
		while(i < 99) { //범위도 홀수
			i = i + 2;
			tot = tot + i;			
		}
		System.out.println("1에서 100까지의 홀수 합은?  " +tot);
	}
}
