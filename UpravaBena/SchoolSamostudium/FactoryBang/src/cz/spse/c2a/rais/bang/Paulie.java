package cz.spse.c2a.rais.bang;

public class Paulie implements Postava {
	int health;
	int maxHealth;
	String zbran=null;
	public Paulie(int maxHealth) {
		super();
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
	@Override
	public String getName() {
		return "Tommy";
	}
	@Override
	public int getMaxHealth() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public int getHealth() {
		return health;
	}
	@Override
	public void damage(int d) {
		if(zbran==null) {
			d=3;
		}else {
			d=20;
		}
		
	}
	@Override
	public void heal(int d) {
		if(d>0) {
			health= health+d;
		}
		
	}
	@Override
	public Group getGroup() {
		return Group.salieri;
		
		
	}

}
