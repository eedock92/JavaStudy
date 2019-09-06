package ch02.var3;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int num;
		String mail;
		String tel;
		String str;
		
		
		System.out.println("이름 입력하세요.");
		name = sc.nextLine();
		System.out.printf("입력된 이름은 %s 입니다.%n",name);
	
		System.out.println("나이 입력하세요.");
		num = Integer.parseInt(sc.nextLine());
		System.out.printf("입력된 나이는 %d세 입니다.%n",num);
		
		do {
		System.out.println("메일 주소를 입력하세요.");
		mail = sc.nextLine();
		System.out.printf("입력된 메일은 %s 입니다.%n",mail);
		
		if(!mail.contains("@")) {
			System.out.println("이메일 주소 형식이 아닙니다.");
		}else {
			break;
		}
		}while(true);
		
		System.out.println("전화 번호를 입력하세요.");
		tel = sc.nextLine();
		System.out.printf("입력된 전화 번호는 %s%n",tel);
		
		System.out.println("오늘 수업한 본인의 느낌은 어떠한가요?");
		str = sc.nextLine();
		System.out.printf("답변 : %s",str);

	}

}
