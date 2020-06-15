package cz.spse.c2a.rais.bang;

public interface Postava {

	public String getName();
	public int getMaxHealth();
	public int getHealth();
	public void damage(int d);
	public void heal(int d);
	public Group getGroup();
}
