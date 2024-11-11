package chapter10.interface_part;

// 평민
public class Novice {
	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	
	public Novice() { }

	public Novice(String name, int strength, int dexterity, int intelligence) {
		super();
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	// 기본 공격 메서드
	public void attack() {
		System.out.println("기본 공격");
	}

	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	@Override
    public String toString() {
        return String.format("[ID: %s, stat: 힘(%d)" +
    ", 민첩(%d), 지능(%d)]", name, strength, dexterity, intelligence);
    }
	
	
	
}
