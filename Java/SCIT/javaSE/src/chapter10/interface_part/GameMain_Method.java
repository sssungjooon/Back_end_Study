package chapter10.interface_part;

import java.util.Random;
import java.util.Scanner;

public class GameMain_Method {

	public void printMenu() {
		String menu = """
				=== ABCDE_rpg ===
				1. 캐릭터 생성
				2. 캐릭터 정보
				3. 전직하기
				4. 기본 공격
				5. 스킬 사용
				0. 종료 
				=================
				번호를 선택하세요 :
				""";
		System.out.println(menu);
	}
	
	public Novice createCharacter() {
		Novice novice = null;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("캐릭터를 생성합니다.");
		System.out.println("사용하실 아이디를 입력해 주세요: ");
		String id = sc.next();
		int str = 0, dex = 0, intel=0, sum=0;
		String text = "";
		
		while (true) {
			System.out.println("스탯을 부여합니다.");
			
			while (true) {
				str = ran.nextInt(10);
				dex = ran.nextInt(10);
				intel = ran.nextInt(10);
				sum = str + dex + intel;
				if (sum >= 15)
					break;
				
			}
			
			System.out.printf("부여된 스탯정보: 힘[%d]"
					+ ", 민첩[%d], 지능[%d]\n",
					str, dex, intel);
			System.out.print("스탯을 다시 받으시겠습니까? (y/n): ");
			text = sc.next();
			
			if (text.equals("n"))
				break;
			
		}
		
		System.out.println("현재 정보로 저장합니다.");
		novice = new Novice(id, str, dex, intel);
		System.out.println();
		
		return novice;
	}

	public void printText(int i) {
		switch (i) {
		case 1 -> System.out.println("게임을 종료합니다.");
		case 2 -> System.out.println("번호를 잘못 입력했습니다.");
		case 3 -> System.out.println("캐릭터를 생성하세요.");
		case 4 -> System.out.println("스킬을 배우지 않았습니다.");
		}
		
	}
	
	public void characterInfo(Novice novice) {
		String job = "";
		
		if (novice instanceof Knight)
			job = "기사";
		else if (novice instanceof Thief)
			job = "도적";
		else if (novice instanceof Magician)
			job = "마법사";
		else 
			job = "평민";
		String str = String.format("[ID: %s(%s), stat: "
				+ "힘(%d), 민첩(%d), 지능(%d)"
				, novice.getName()
				, job
				, novice.getStrength()
				, novice.getDexterity()
				, novice.getIntelligence());
		System.out.println(str);
	}
	
	//전직을 위해 번호를 입력받는 메서드
		public int numberInput() {
			Scanner sc = new Scanner(System.in);
			int num = 0;
			while(num > 3 || num < 1) {
				System.out.println("=== 직업 종류 ===");
				System.out.println("1. 기사");
				System.out.println("2. 도적");
				System.out.println("3. 마법사");
				System.out.print("전직할 직업의 번호를 선택하세요 : ");
				num = sc.nextInt();
			}
			return num;
		}
		
		//직업에 따라 인스턴스를 생성하는 메서드
		//선택한 직업에 따라 해당 클래스로 인스턴스를 생성하고, 문구를 출력한다.
		public Novice jobSelect(int num, Novice novice) {
			Novice character = null;
			switch (num) {
				case 1 -> {
					character = new Knight(novice.getName(), novice.getStrength(), 
							novice.getDexterity(), novice.getIntelligence());
					System.out.println("기사로 전직합니다.");				
				}
				case 2 -> {
					character = new Thief(novice.getName(), novice.getStrength(), 
							novice.getDexterity(), novice.getIntelligence());
					System.out.println("도적으로 전직합니다.");
				}
				case 3 -> {
					character = new Magician(novice.getName(), novice.getStrength(), 
							novice.getDexterity(), novice.getIntelligence());
					System.out.println("마법사로 전직합니다.");				
				}
			}
			
			return character;
		}	
		
		public Skill skill(Novice novice) {
			Skill skill = null;
//			if (novice instanceof Knight) 
//				skill = (Knight) novice;
			// 패턴 매칭 (변수 instanceof 타입 캐스팅변수)
			if		(novice instanceof Knight knight)
				skill = knight; 
			else if	(novice instanceof Thief thief)
				skill = thief;
			else if	(novice instanceof Magician magician)
				skill = magician;
			
			return skill;
		}

}
