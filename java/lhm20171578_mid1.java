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
			//������� ���������� �Է� �ޱ�
			System.out.print("���������������������������������� �������������� ����������������������������������\n�� ����, ����, ��, �� �� �ϳ��� �Է��ϰ� EnterŰ�� ��������.\n�� ����� �� ");
			userText = sc.nextLine();
			
			//������� �Է��� ������ ��ȯ
			if(userText.equals("����")) user = 0;
			else if(userText.equals("����")) user = 1;
			else if(userText.equals("��")) user = 2;
			else {
				System.out.println("��\n��\n��\n��\n��\n��\n�� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			//��ǻ���� ���������� ���� ����
			ran = (int)(Math.random()*3);
			if (ran == 0) com = "����"; else if (ran == 1) com = "����"; else if (ran == 2) com = "��";
			
			//���������� ���
			if(((ran-user)==-1)|((ran-user)==2)) {
				System.out.println("��     vs\n�� ��ǻ�� �� " + com +"\n��    [�¸�]\n�� �Ϳ�~! �̰���ϴ�!!"); 
			} else if(((ran-user)==1)|((ran-user)==-2)) {
				System.out.println("��     vs\n�� ��ǻ�� �� " + com +"\n��    [�й�]\n�� �����ϴ�..�Ф�");
			} else if (ran==user) {
				System.out.println("��     vs\n�� ��ǻ�� �� " + com +"\n��   [���º�]\n�� �� �����ϴ�! �ٽ�!");
				continue;
			}
			
			//���� ����
			System.out.println("������������������������������������������������������������������������������������������");
			System.out.println("�� �ٽ��ϱ⸦ ���Ͻø� �ٽ��ϱ⸦ �Է��ϰ� EnterŰ�� ��������.");
			System.out.print("�� ���Ḧ ���Ͻø� �׳� EnterŰ�� ��������.\n�� �� ");
			re = sc.nextLine();
			if (re.equals("�ٽ��ϱ�")) {
				System.out.println("��\n��\n��\n��\n��\n��");
				continue;
			}
			else break;
		}
		System.out.println("�� ���α׷��� ����Ǿ����ϴ�.\n������������������������������������������������������������������������������������������");
	}
}