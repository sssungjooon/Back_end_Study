package chapter06.class_part1;

public class Character {
	
	// 캐릭터 정보
	private String id;			// id
	private String job;			// job
	private int level;			// 레벨
	private int str;			// 힘 스탯
	private int dex;			// 민첩 스탯
	private int intel;			// 지능 스탯 
	
	/*
	 	1. level, str, dex, intel 은 생성시 1로 초기화한다.
	 	2. 명시적 생성자 생성
	 		- id, job을 파라미터로 가지는 생성자
	 		- id, job, level, str, dex, intel 을 파라미터로 가지는 생성자
	 	3. skill() public 메서드 생성
	 		- 인스턴스의 job이 "마법사"면 "파이어볼" 출력
	 		- 인스턴스의 job이 "전사"면 "배쉬" 출력
	 		- 인스턴스의 job이 "궁수"면 "크리티컬" 출력
	 		- 그 외 "기본공격" 출력
	 	4. 해당 인스턴스의 정보를 출력하는 메서드 생성
	 		- 출력 형식
	 		[고구마(궁수) Lv5]님의 스탯: str(3), dex(11), intel(2)
	 */
	
	// 인스턴스 초기화 블록 (생성시 1로 초기화)
	{
		this.level = 1;
		this.str = 1;
		this.dex = 1;
		this.intel =1;
	}
	
	// id, job을 파라미터로 가지는 생성자 (명시적 생성자)
	public Character(String id, String job) {
		this.id = id;
		this.job = job;
	}
	
	// id, job, level, str, dex, intel 을 파라미터로 가지는 생성자 (명시적 생성자)
	public Character(String id, String job, int level,int str, int dex, int intel) {
		this.id = id;
		this.job = job;
		this.level = level;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
	}
	
//	public void skill() {
//		if (job == "마법사") {
//			System.out.println("파이어볼");
//		} else if (job == "전사") {
//			System.out.println("배쉬");
//		} else if (job == "궁수") {
//			System.out.println("크리티컬");
//		} else {
//			System.out.println("기본공격");
//		}
//	}
	
	public void skill() {
		if (this.job.equals("마법사")) {
			System.out.println("파이어볼");
		} else if (this.job.equals("전사")) {
			System.out.println("배쉬");
		} else if (this.job.equals("궁수")) {
			System.out.println("크리티컬");
		} else {
			System.out.println("기본공격");
		}
	}
	
//	public void info() {
//		System.out.println("[" + id + "(" + job + ") Lv" + level + "]님의 스탯: str("
//				+ str + "), dex(" + dex + "), intel(" + intel + ")");
//	}
	
	/*
	 	printf 출력 서식 (자바 1.5이상)
	 	%b : boolean 형식으로 출력
	 	%d : 정수 형식으로 출력
	 	%f : 소수점 형식으로 출력
	 	%c : 문자 형식으로 출력
	 	%s : 문자열 형식으로 출력
	 	%o : 8진수 정수의 형식으로 출력
	 	%x : 16진수 정수의 형식으로 출력
	 */
	
	// 정보를 출력하는 메서드
	public void info() {
		System.out.printf("[%s(%s) Lv%d]님의 스탯: " 
				+ "str(%d), dex(%d), intel(%d) \n"
				, id, job, level, str, dex, intel);
	}
	
}
