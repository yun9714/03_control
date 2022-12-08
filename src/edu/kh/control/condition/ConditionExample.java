package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {// 기능 정의용 클래스
	public void ex1() {
		// if문
		// - 조건식이 true일 때만 내부코드 수행
		/* [작성법]
		 * if(조건식) {
		 *      조건식이 true일 때 수행될 코드
		 *      }
		 */
		// if-else문
		// - 조건식 결과가 true이면 if문, false이면 else구문이 수행
		/* [작성법]
		 * if(조건식) {
		 *      조건식이 true일 때 수행될 코드
		 *      }else{
		 *      조건식이 false일 때 수행될 코드
		 *      } 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수가 아닙니다.");
		}
		/*if(input <= 0) {
			System.out.println("양수가 아닙니다.");
		} -> 비효율적인 코드 */
	}
	public void ex2() {
		// 홀짝 검사
		// 입력받은 값이 홀인지 짝인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if((input % 2) == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		// 짝홀 판별은 %2 했을 때 0이면 짝수 아니면 홀수
	}
	public void ex3() {
		// 달(month)를 입력받아 해당 달에 맞는 계절을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력 : ");
		int month = sc.nextInt(); // 1>월<이라 입력하면 error
		// 사용자에게 온도를 받음
		System.out.println("온도 입력 : ");
		int temperature = sc.nextInt();
		String season;
		// 봄 : 3,4,5
		// 여름 : 6,7,8
		// 가을 : 9,10,11
		// 겨울 : 12,1,2
		
		if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if(month >= 6 && month <= 8) {
			season = "여름";
			if(temperature >= 35 ) {
				// season = season + "";
				// season = season + "폭염경보";
				season += "폭염경보";
			}else if(temperature >= 33) {
				season += "폭염 주의보";
			}
		}else if(month >= 9 && month <= 11) {
			season = "가을";
		}else if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		}else {
			season = "계절이 없습니다.";
		}
		System.out.println(season);
	}
	public void ex4() {
		// 나이를 입력받아
		// 13세 이하이면 "어린이입니다."
		// 13세 초과 19세 이하이면 "청소년입니다."
		// 19세 초과시 "성인입니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		String age2;
		if(age <= 13) {
			age2 = "어린이입니다.";
		}else if(age > 13 && age <= 19) {
			age2 = "청소년입니다.";
		} else {
			age2 = "성인입니다.";
		}
		System.out.println(age2);
	}
	public void ex5() {
		// 점수(100점 만점)를 입력받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100점 초과 : "잘못 입력하셨습니다."
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String score2;
		
		if(score >= 90 && score < 101) {
			score2 = "A";
		}else if(score >= 80 && score < 90) {
			score2 = "B";
		}else if(score >= 70 && score < 80) {
			score2 = "C";
		}else if(score >= 60 && score < 70) {
			score2 = "D";
		}else if(score >= 0 && score < 60) {
			score2 = "F";
		} else {
			score2 = "잘못 입력하셨습니다.";
		}
		System.out.println(score2);
	}
	public void ex6() {
		// 놀이기구 탑승 제한 검사 프로그램 
		// 조건 - 나이 : 12세 이상
		//     - 키 : 140.0cm 이상
		
		// 나이를 0-100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력하셨습니다."
		// 키를 0-250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력하셨습니다."
		// -> 입력 되자마자 검사를 진행하여 잘못된 경우 프로그램 종료
		
		//나이O, 키X : "나이는 적절하나, 키가 적절치 않음."
		//나이x, 키O : "키는 적절하나, 나이가 적절치 않음."
		//나이x, 키X : "나이와 키 모두 적절치 않음."
		//나이O, 키O : "탑승 가능."
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age < 0 || age > 100) {
			 System.out.println("나이를 잘못 입력하셨습니다.");
		} else {	
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			if(height < 0 || height >250.0) {
				System.out.println("키를 잘못 입력하셨습니다.");
			} else {
				if(age >= 12 && height < 140.0) {
					System.out.println("나이는 적절하나, 키가 적절치 않음");
				} else if(age < 12 && height >= 140.0) {
					System.out.println("키는 적절하나, 나이가 적절치 않음");
				}else if(age < 12 && height < 140.0) {
					System.out.println("나이와 키 모두 적절치 않음");
				}else if(age >= 12 && height >= 140.0) {
					System.out.println("탑승 가능.");
				}
			}
		}
	
	}
		
}

