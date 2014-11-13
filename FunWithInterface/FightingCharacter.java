/**
*This file contains the caracters that we'll actually play with in the game of clabboring;)
*
*The objective is to learn/teach Interface and Abstract classes in Java. 
*@vsoyseth
*/


public abstract class FightingCharacter implements Skill{
	protected String name;
	protected int    health;

	protected FightingCharacter(String name){
		this.name   = name;
		this.health = 100;
	}
}

//The classic MrT character from A-Team
class MrT extends FightingCharacter{
	public MrT(){
		super("MrT");
	}

	public String hit(){
		return "I petty the fool!";
	}
	public String getsHit(int damage){
		health = health - damage;
		if(isDead()) return "Ugh";
		else         return "Shit son! What yo mama been feeding ya!?";
	}
	public String getName(){
		return name;
	}
	public int getHealth(){
		return health;
	}
	public boolean isDead(){
		return health <= 0;
	}
}

