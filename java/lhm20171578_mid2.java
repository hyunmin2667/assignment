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
			//������� ���������� �Է� �ޱ�
			System.out.print("���������� ���� : 1(����), 2(����), 3(��) ���ڸ� �Է��ϼ���.\n�Է� : ");
			try {
				user = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
				sc = new Scanner(System.in);
				continue;
			}
			user-=1;
			switch (user) {
			case 0 : userText = "����"; break;
			case 1 : userText = "����"; break;
			case 2 : userText = "��"; break;
			default : 
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			
			//��ǻ���� ���������� ���� ����
			ran = (int)(Math.random()*3);
			switch (ran) {
			case 0 : com = "����"; break;
			case 1 : com = "����"; break;
			case 2 : com = "��"; break;
			}
	
			//���������� ���
			switch (ran-user) {
			case 0 :
				System.out.println("USER : " + userText + "\n    vs\nCOM  : " + com +"\n���º� �Դϴ�.");
				break;
			case -1 :
			case 2 :
				System.out.println("USER : " + userText + "\n    vs\nCOM  : " + com +"\nUSER �¸�!");
				break;
			case 1 :
			case -2 :
				System.out.println("USER : " + userText + "\n    vs\nCOM  : " + com +"\nCOMPUTER �¸�!");
				break;
			}
			
			//���� ����
			System.out.print("1(�ٽ��ϱ�), ������ ����(����) : ");
			re = sc.nextInt();
			if (re == 1) continue;
			else break;
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}