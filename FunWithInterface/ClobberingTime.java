/**
*CloberingTime is a game where to characters fight till their death
*
*Sounds awesome right? Well, it is! 
*NOT FINISHED! 
*Todolist:
*-Add more characters.
*-Make logic for fighting.
*-Make UI
*@vsoyseth
*/

public class ClobberingTime{
	public static void main(String[] args) {
		MrT fighter1 = new MrT();
		DrA fighter2 = new DrA();

		System.out.println(fighter1.hit());
		System.out.println(fighter1.getsHit(102));
	}
}