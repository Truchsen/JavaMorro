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
	public boolean isDead(){
		if     (health <  0) health = 0;
		return  health <= 0;
	}
	@Override
	public String toString(){
		return name;
	}
	public int getHealth(){
		return health;
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
}

//The legendary master of logic at the University of Oslo
class DrA extends FightingCharacter{
	public DrA(){
		super("Dr Antonsen");
	}
	public String hit(){
		return "0.9999999... is IN FACT 1! #POW#";
	}
	
	public String getsHit(int damage){
		health = health - damage;
		if(isDead()) return "";
		else         return "I'll never admit that false->true is false";
	}
}

class TheJoker extends FightingCharacter{
	public TheJoker(){
		super("The Joker");
	}
	public String hit(){
		return "HOHOHOHAHAHA... #DYSJ#";
	}
	public String getsHit(int damage){
		health = health - damage;
		if(isDead()) return "Why so serious? UUuuuu....";
		else         return "Auch.";
	}
}

