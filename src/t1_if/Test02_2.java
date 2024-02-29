package t1_if;

// 논리 연산자 (!not, &&and, ||or)
public class Test02_2 {
	public static void main(String[] args) {
		int su1 = 10, su2 = 15, su3 = 30, max = -99;
		
		if(su1 > su2 && su1 > su3) {
			max = su1;
			}
			else if (su2 > su3){
					max = su2;
			}
			else {
				max = su3;
		}
		System.out.println("수1 : "+su1+", 수2 : "+su2+", 수3 : "+su3+", max : " + max);
	}
}

/* 사진
 * AND A&&B 확실한 성격
 * OR A||B 우유부단한 성격
 * NOT !A 부정
 * Buffer 잠시 담아두는 장소 
 * EOR A eor B
 */ 
