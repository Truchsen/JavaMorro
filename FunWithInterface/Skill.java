/**
*Contains the method the gamecharacters have.
*@vsoyseth
*/
public interface Skill{

	public String  hit();
	public String  getsHit(int damage);
	public String  getName();
	public int     getHealth();
	public boolean isDead();
}