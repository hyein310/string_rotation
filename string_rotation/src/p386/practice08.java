package p386;

//���ڿ��� �Է¹޾� �� ���ھ� ȸ������ ��� ����ϴ� ���α׷��� �ۼ��϶�.

import java.util.Scanner;

public class practice08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String str = scan.nextLine();
		for(int i = 1; i <= str.length() ;i++) {					
			System.out.print(str.substring(i));
			System.out.println(str.substring(0, i));
		}
		scan.close();	
	}

}
