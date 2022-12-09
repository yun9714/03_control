package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	/* switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다.
	 * [작성법]
	 * switch(식) {
	 * 	case (식에따른)결과값1 : 수행코드1; break;
	 * 	case 결과값2 : 수행코드2; break;
	 * 	case 결과값3 : 수행코드3; break;
	 * 	...
	 *  default : case를 모두 만족하지 않을 경우 수행하는 코드(==else)
	 * }
	 */
	public void ex1() {
		// 키보드로 정수를 입력받아
		// 1이면 빨강색
		// 2이면 주황색
		// 3이면 노란색
		// 4이면 초록색
		// 1-4 사이 숫자가 아니면 흰색 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		String result;
		
		/*if(input == 1) {
			result = "빨강색";
		}else if(input == 2) {
			result = "주황색";
		}else if(input == 3) {
			result = "노란색";
		}else if(input == 4) {
			result = "초록색";
		}else {
			result = "흰색";
		}	
		System.out.println(result);*/
		
		switch(input) {
		case 1 : result = "빨강색"; break;
		case 2 : result = "주황색"; break;
		case 3 : result = "노란색"; break;
		case 4 : result = "초록색"; break;
		default : result = "흰색";
		}
		System.out.println(result);
	}
	public void ex2() {
		// 달에 따른 계절
		Scanner sc = new Scanner(System.in);
		System.out.println("달 입력 : ");
		int month = sc.nextInt();
		String result;
		
		switch(month) {
		case 3 : case 4 : case 5 : result = "봄"; break;
		case 6 : case 7 : case 8 : result = "여름"; break;
		case 9 : case 10 : case 11 : result = "가을"; break;
		case 12 : case 1 : case 2 : result = "겨울"; break;
		default : result = "잘못 입력";
		}
		System.out.println(result);
	}
	public void ex3() {
		// 연산자(+,-,*,/,%) -> 연산자는 string
		// 정수1 : 5
		// 정수2 : 10
		// 연산자 : *
		// 계산결과 : 5 * 10 = 50
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String str = sc.next();
		int result;
		
		switch(str) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "*" : result = num1 * num2; break;
		case "/" : 
			if(num2 == 0) {
				System.out.println("0으로 못 나눔.");
				result = 0;
			} else {
				result = num1 / num2;
			}; break;
		case "%" : result = num1 % num2; break;
		default : result = 0;
		}
		System.out.println(result);
	}
//
}
