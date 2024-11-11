package chapter10.interface_part;

// 기사
public class Knight extends Novice implements Skill {
	
	public Knight(String name, int strength,
			int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	@Override
	public void attack() {
		System.out.println("배쉬 공격");
	}
	
	@Override
	public void skill() {
		System.out.println("쇼크 스턴");
	}
	
	
	
}
