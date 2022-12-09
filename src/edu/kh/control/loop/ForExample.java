package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	/* for문
	 * - 끝이 정해져있는(횟수가 정해져있는) 반복문
	 * - 조건에 따라 한번도 수행되지 않을 수 있음
	 * [작성법]
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행될 코드
	 * }
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * - 조건식 : for문의 반복 여부를 지정하는 식 (다음 반복 진행?)
	 *           보통 초기식에 사용된 변수를 이용하여 조건식을 작성함
	 * - 증감식 : 초기식에 사용된 변수를 for문이 끝날 때 마다 증가 or 감소시켜
	 *           조건식의 결과를 변하게 하는 식
	 */
	public void ex1() {
		// 1~10 출력하기
		// -> 1부터 10까지 1씩 증가하며 출력
		// * 반복문은 조건식이 true일 때만 반복
		
		for(int i = 1; i<=10; i++) {
		 // 1) 초기식 2) 조건식 4) 증감식 
			System.out.println("i : " + i);
			//3) 반복 수행될 코드
		}
	}
	public void ex2() {
		// 3-7까지 1씩 증가하며 출력
		// 3 4 5 6 7
		for(int i = 3; i <= 7; i++) {
			System.out.print(i);
		}
	}
	public void ex3() {
		// 1-입력받은 수까지 1씩 증가하며 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int a = sc.nextInt();
	
		for(int i = 1; i <= a; i++) {
			System.out.println("출력 : " + i);
		}
	}
	public void ex4() {
		// 1.0부터 입력받은 실수까지 0.5씩 증가하며 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		double a = sc.nextDouble();
		
		for(double i = 1.0; i <= a; i += 0.5) {
							   	// i = i + 0.5
			System.out.println(i);
		}
	}
	public void ex5() {
		// 영어 알파벳 A부터 Z까지 한 줄로 출력
		// ** char 자료형은? 유니코드
		for(char i = 65; i <= 90; i++) {
			System.out.print(i);
		}
		/*for(int i = 'A'; i <='Z'; i++) {
		 *  System.out.print((char)i);
		 *  }
		 * */
	}
	public void ex6() {
		// 1-10까지 모든 정수의 합 구하기
		// => 합계 : 55
		int sum = 0 ; // 반복되어 증가하는 i값의 합계를 저장할 변수
					  // 0으로 시작하는 이유 : 아무것도 더하지 않음으로
					  //                   정확히 결과 도출 가능함
		for(int i = 1; i <= 10; i++) {
			sum += i;
		// sum = sum + i;
		}
		System.out.println("합계 : " + sum);
	}
	public void ex7() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단 5의 배수에 ()를 붙여서 출력 => 조건
		// 1 2 3 4 (5) 6 7 8 9 (10) ...
		for(int i = 1; i <= 20; i++) {
			if((i % 5) == 0) {
				System.out.print("(" + i + ")");
			} else {
				System.out.print(" " + i);
			}
		}
	}
	//*****중첩 반복문*****
	public void ex8() {
		// 구구단 모두 출력하기
		for(int dan = 2; dan <= 9; dan++) {// 2~9단까지 차례대로 증가
			
			for(int su = 1; su <= 9; su++) {// 각 단에 곱해지는 수, 1~9까지 차례대로 증가 
				System.out.printf("%2d X %2d = %2d",dan, su, dan*su);
			}
			System.out.println(); // 줄바꿈
		}
	}
	public void ex9() {
		// 구구단 역순 출력
		// 9단부터 2단까지 
		// 곱해지는 수는 1~9까지
		
		for(int dan = 9; dan >= 2; dan--) { // 단 9~2까지 역방향 출력
			for(int su = 1; su <= 9; su++) { // 수 1~9까지 출력
				System.out.printf("%2d X %2d = %2d",dan, su, dan*su);
			}
			System.out.println();
		}
	}
	public void ex10() {
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int a = 1; a <=5; a++) { //5바퀴 반복하는 for문
			for(int i = 1; i <= 5; i++) { // 12345 한 줄 출력하는 for문
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public void ex11() {
		// 54321
		// 54321
		// 54321
		// 54321
		// 54321
		
		for(int a = 1; a <=5; a++) {
			for(int i = 5; i >= 1; i--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public void ex12() {
		// 1
		// 12
		// 123
		// 1234
		// -----------
		// 4321
		// 321
		// 21
		// 1
		
		for(int i = 1; i <= 4; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.print(x);
			} System.out.println();
		}
		System.out.println("-----------");
		
		for(int i = 4; i >= 1; i--) {
			for(int x = i; x >= 1; x--) {
				System.out.print(x);
			} System.out.println();
		}
	}

//	
}
