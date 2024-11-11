package chapter10.interface_part;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		/*
		 * 생성할 클래스
		 * 		GameMain(메인메서드 포함), GameMain_Method(기능)
		 * 		클래스		
		 * 			Novice(부모),
		 * 			Knight, Magician, Thief (자식)
		 * 		인터페이스
		 * 			Skill
		 * 	
		 * Game, 게임 예제
		 * 1. 프로그램이 실행되면 메뉴를 출력한다.
		 * 2. 메뉴는 (1.캐릭터 생성, 2.캐릭터 정보, 3.전직하기, 4.공격하기, 0.종료)
		 *    - (1.캐릭터 생성)을 선택한 경우, 이름과 스탯값을 초기값으로 하는 Novice(평민)클래스형 인스턴스를 생성한다.
		 *      스탯은 (힘, 민첩, 지능)이 있으며 각각 랜덤한 값을 가지고, 
		 *      형평성을 위해 스탯(1~9정도)의 총 합이 15이상인 경우에만 저장되도록 하며,
		 *      사용자의 선택에 따라 해당 스탯을 저장 or 스탯 재부여 할 수 있도록 한다.
		 * 3. - (2.캐릭터 정보)를 선택한 경우, 생성된 캐릭터의 이름, 직업, 힘, 민첩, 지능을 출력한다.
		 * 4. - (3.전직하기)를 선택한 경우, 생성된 캐릭터의 정보를 초기값으로 가지는 
		 *      선택한 클래스에 해당하는 인스턴스를 생성하고 문구를 출력한다.
		 * 5. - (4.공격하기)를 선택한 경우, Attack()메서드를 호출하여 직업(인스턴스)에 따라 공격한다.
		 * 6. - (5.스킬사용)을 선택한 경우, Skill()메서드를 호출하여 직업(인스턴스)에 따라 스킬을 사용한다.
		 * 7. - (0.종료)를 선택한 경우, 프로그램을 종료한다.
		 * 8. - 종료를 선택하기 전까지 반복한다.
		 * 
		 * === ABCDE_rpg ===
		 * 1. 캐릭터 생성
		 * 2. 캐릭터 정보
		 * 3. 전직하기
		 * 4. 기본 공격
		 * 5. 스킬 사용
		 * 0. 종료 
		 * =================
		 * 번호를 선택하세요 :
		 * 캐릭터를 생성합니다.
		 * 사용하실 아이디를 입력해 주세요 :
		 * 스탯을 부여합니다.
		 * 부여된 스탯정보: 힘[5], 민첩[7], 지능[5]
		 * 스탯을 다시 받으시겠습니까? (y/n)
		 * 현재 정보로 저장합니다. 
		 * */
		GameMain_Method gm = new GameMain_Method();
		Scanner sc = new Scanner(System.in);
		Novice character = null;
		Skill skill = null;
		int num = 0;
		
		while (true) {
			gm.printMenu();
			int select = sc.nextInt();
			switch (select) {
			case 1: //캐릭터 생성
				character = gm.createCharacter();
				System.out.println(character);
				break;
			case 2:
				if (character != null)
					gm.characterInfo(character);
				else
					gm.printText(3);
				break;
			case 3:
				if(character != null) {
					int jobNum = gm.numberInput();
					character = gm.jobSelect(jobNum, character);						
				} else
					gm.printText(3);
				break;
			case 4:
				if(character != null)
					character.attack();
				else
					gm.printText(3);	
				break;
			case 5:
				if(character != null) {
					skill = gm.skill(character);
					if(skill != null)
						skill.skill();
					else
						gm.printText(4);
				}
				else
					gm.printText(3);
				break;
			case 0:
				gm.printText(1);
				return;
				// break;
			default:
				gm.printText(2);
			}
		}
		
	}

}
