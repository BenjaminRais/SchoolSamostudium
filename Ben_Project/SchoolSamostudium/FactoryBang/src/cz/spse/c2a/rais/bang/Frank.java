package cz.spse.c2a.rais.bang;

public class Frank implements Postava {
	int health;
	int maxHealth;
	String zbran=null;
	public Frank(int maxHealth) {
		super();
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}
	@Override
	public String getName() {
		return "Frank";
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
		d=0;
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
