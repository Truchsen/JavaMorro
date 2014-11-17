/**
*CloberingTime is a game where to characters fight till their death
*
*Sounds awesome right? Well, it is! 
*NOT FINISHED! 
*Todolist:
*-Add more characters.						: 3 so far
*-Make logic for fighting.					: NF
*-Make list (implements iterator, iterable)	: Done
*-Make UI									: NF
*-Use threads for something cool			: NF
*@vsoyseth
*/

public class ClobberingTime{
	public static void main(String[] args) {
		FightingCharacter fighter1 = new MrT();
		FightingCharacter fighter2 = new DrA();
		FightingCharacter fighter3 = new TheJoker();

		GameCharacterList list = new GameCharacterList();

		list.add(fighter1);
		list.add(fighter2);
		list.add(fighter3);

		for(Object fc: list) System.out.println(fc);

		//System.out.println(fighter1 + ": " + fighter1.hit() + " | " + fighter2 + ": " + fighter2.getsHit(50));
		//System.out.println(fighter2 + ": " + fighter2.hit() + " | " + fighter1 + ": " + fighter1.getsHit(101));
	}
}