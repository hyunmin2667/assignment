package middle_project;

import java.util.Scanner;

public class lhm20171578_mid1 {
//Rock Paper Scissors game
	public static void main(String[] args) {
		String com = "";
		String userText = "";
		int user = 0;
		int ran = 0;
		String re ="";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//사용자의 가위바위보 입력 받기
			System.out.print("┣━━━━━━━━━━━━━━━━ 가위바위보게임 ━━━━━━━━━━━━━━━━━\n┃ 가위, 바위, 보, 셋 중 하나를 입력하고 Enter키를 누르세요.\n┃ 사용자 ▶ ");
			userText = sc.nextLine();
			
			//사용자의 입력을 정수로 변환
			if(userText.equals("가위")) user = 0;
			else if(userText.equals("바위")) user = 1;
			else if(userText.equals("보")) user = 2;
			else {
				System.out.println("┃\n┃\n┃\n┃\n┃\n┃\n┃ 잘못입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			//컴퓨터의 가위바위보 랜덤 생성
			ran = (int)(Math.random()*3);
			if (ran == 0) com = "가위"; else if (ran == 1) com = "바위"; else if (ran == 2) com = "보";
			
			//가위바위보 결과
			if(((ran-user)==-1)|((ran-user)==2)) {
				System.out.println("┃     vs\n┃ 컴퓨터 ▶ " + com +"\n┃    [승리]\n┃ 와우~! 이겼습니다!!"); 
			} else if(((ran-user)==1)|((ran-user)==-2)) {
				System.out.println("┃     vs\n┃ 컴퓨터 ▶ " + com +"\n┃    [패배]\n┃ 졌습니다..ㅠㅠ");
			} else if (ran==user) {
				System.out.println("┃     vs\n┃ 컴퓨터 ▶ " + com +"\n┃   [무승부]\n┃ 앗 비겼습니다! 다시!");
				continue;
			}
			
			//재경기 여부
			System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("┃ 다시하기를 원하시면 다시하기를 입력하고 Enter키를 누르세요.");
			System.out.print("┃ 종료를 원하시면 그냥 Enter키를 누르세요.\n┃ ▶ ");
			re = sc.nextLine();
			if (re.equals("다시하기")) {
				System.out.println("┃\n┃\n┃\n┃\n┃\n┃");
				continue;
			}
			else break;
		}
		System.out.println("┃ 프로그램이 종료되었습니다.\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
}