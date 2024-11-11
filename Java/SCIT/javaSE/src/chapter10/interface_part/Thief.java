package chapter10.interface_part;

public class Thief extends Novice implements Skill {
	
	public Thief(String name, int strength,
			int dexterity, int intelligence) {
		super(name, strength, dexterity, intelligence);
	}
	
	@Override
	public void attack() {
		System.out.println("크리티컬");
	}
	
	@Override
	public void skill() {
		System.out.println("중독");
	}
}
