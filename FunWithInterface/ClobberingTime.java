/**
*CloberingTime is a game where to characters fight till their death
*
*Sounds awesome right? Well, it is! 
*NOT FINISHED! 
*Todolist:
*-Add more characters.
*-Make logic for fighting.
*-Make list (implements iterator, iterable)
*-Make UI
*@vsoyseth
*/

public class ClobberingTime{
	public static void main(String[] args) {
		MrT fighter1 = new MrT();
		DrA fighter2 = new DrA();

		System.out.println(fighter1 + ": " + fighter1.hit() + " | " + fighter2 + ": " + fighter2.getsHit(50));
		System.out.println(fighter2 + ": " + fighter2.hit() + " | " + fighter1 + ": " + fighter1.getsHit(101));
	}
}