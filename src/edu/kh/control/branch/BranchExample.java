package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복(for)
		// 단, 5를 출력하면 반복문 멈춤(if)
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + ""); // 위치 주의
			if(i == 5) {
				break; // 반복문을 멈춤
			}
		}	
	}
	public void ex2() {
		// 0이 입력될 때까지 모든 정수의 합 구하기
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		while(true) { // i가 0이 아닐 때 계속 반복
			System.out.print("정수 입력 : ");
			i = sc.nextInt();
			
			if(i == 0) {
				break;
			}
			sum += i;  // 누적
		}System.out.println("합계 : " + sum);	
	}
	public void ex3() {
		// break : 반복문을 바로 멈춤
		// continue : 다음 반복으로 넘어감
		// 3의 배수 제외 1~10까지 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}System.out.println( i + "");
		}
	}
	public void ex4() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고, 증가하는 값이 40이 되었을 때 반복 멈춤
		
		for(int i = 1; i <= 100; i++) {
			if(i == 40) {
				break;
			} // 순서 중요; 밑과 바뀌면 40을 만나지 않아서 멈추지 않고 100까지 감
			if(i % 5 == 0) {
				continue;
			} System.out.println("값 : " + i);
			
		}
	}
//	
}
