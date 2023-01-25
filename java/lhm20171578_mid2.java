package middle_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lhm20171578_mid2 {

	public static void main(String[] args) {
		String com = "";
		String userText ="";
		int user = 0;
		int ran = 0;
		int re = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			//사용자의 가위바위보 입력 받기
			System.out.print("가위바위보 게임 : 1(가위), 2(바위), 3(보) 숫자를 입력하세요.\n입력 : ");
			try {
				user = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요");
				sc = new Scanner(System.in);
				continue;
			}
			user-=1;
			switch (user) {
			case 0 : userText = "가위"; break;
			case 1 : userText = "바위"; break;
			case 2 : userText = "보"; break;
			default : 
				System.out.println("잘못입력하셨습니다. 다시 입력하세요");
				continue;
			}
			
			//컴퓨터의 가위바위보 랜덤 생성
			ran = (int)(Math.random()*3);
			switch (ran) {
			case 0 : com = "가위"; break;
			case 1 : com = "바위"; break;
			case 2 : com = "보"; break;
			}
	
			//가위바위보 결과
			switch (ran-user) {
			case 0 :
				System.out.println("USER : " + userText + "\n    vs\nCOM  : " + com +"\n무승부 입니다.");
				break;
			case -1 :
			case 2 :
				System.out.println("USER : " + userText + "\n    vs\nCOM  : " + com +"\nUSER 승리!");
				break;
			case 1 :
			case -2 :
				System.out.println("USER : " + userText + "\n    vs\nCOM  : " + com +"\nCOMPUTER 승리!");
				break;
			}
			
			//재경기 여부
			System.out.print("1(다시하기), 나머지 숫자(종료) : ");
			re = sc.nextInt();
			if (re == 1) continue;
			else break;
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}