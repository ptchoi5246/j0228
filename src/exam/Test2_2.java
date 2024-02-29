package exam;

import java.util.Scanner;

/*
2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되,
이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다. :: 두 숫자의 교환 (앞의 숫자가 크면 교환)
*/

public class Test2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1, su2, tot = 0, temp = 0, cnt = 0, total = 0, startSu;
		//두개의 숫자: su1, su2; 두개 숫자 사이의 합:tot; 교체: temp; 5개항 결과: cnt; 누적합계 : total; 마지막 결론에서 원래의 su1: startSu;
		
		System.out.print("첫번째 수를 입력하세요~!  ");
		su1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요~!  ");
		su2 = sc.nextInt();
		//먼저 출력해야한다.
		System.out.println("첫번째 수 : "+su1+" , 두번째 수 :   " + su2);
		//temp 뒤에 출력하게 되면 su1이 무조건 su2보다 적은 수로 출력이 된다. 그래서 먼저 출력 받는다.
		
		if(su1 > su2) { //su1이 무조건 작아야한다. 두 수의 교환 temp 사용;
			temp = su1;
			su1 = su2;
			su2 = temp;
		} //여기를 통과하면 su1이 항상 작은수가 된다.
		
		startSu = temp = su1;
				
		while (su1 <= su2) { //su1 작은수 su2 큰수 ; 나 자신부터 반복해야하기에 = 입력해야 한다. *hw1 - int i = 0, =1 참고
			tot += su1; //su1부터의 합계
			// total += su1; //** su1부터 합계의 누적, 34,35중복
			cnt++; //5개 항
			
			if(cnt % 5 == 0 ) { //clear 써도 된다.
				System.out.println(temp + "~" + su1 + " : " + tot); //su1
				total += tot; //**34,35 중복 삭제로 40 입력
				tot = 0; //다음행에서 누적이 아니라 클리어가 되어야 해서 tot = 0
				temp = su1 + 1; //출력되고 나면 su1이 전항 마지막 값이 그대로 다음항 첫번째 값으로 입력되기 때문에 +1로 다음항 첫번째 값으로 출력하기 위함
			}
			su1++; // (i<100)에서 i가 증가하는것처럼 su1 증가;	
		}
		//5행까지 출력되는 항과 그 합의 결과
		
		if(cnt % 5 != 0) { //5행 뒤 나머지 그 합의 결과
			total += tot; //**if(cnt%5 에서 나머지 토탈까지 내려와서 전체합계에 합계
			System.out.println(temp + "~" + --su1 + " : " + tot); //while 에서 빠져나오고 su1++ 때문에 증가 되었기 때문에 --su1 입력;
		}

		System.out.println("총합 ("+startSu+" ~ "+su2+") : " + total);
		
		sc.close();
	}
}
