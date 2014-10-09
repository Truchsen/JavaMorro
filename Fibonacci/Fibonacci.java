/*Fibonaccis tallrekke
 *Et program som går gjennom Fibonaccis tallrekke ved hjelp av en rekursiv metode.
 *
 *@vegardds
 */

class Fibonacci{
	private static int n1       =  0; //n1 i tallrekken.
	private static int n2       =  1; //n2 i tallrekken.
	private static int index    =  0; //indeksering av tallrekken.
	private static int maxIndex = 40; //overste indeks i tallrekkken.

	/*main metode
	 *Skriver ut forste tall i rekken og kaller pa newNumber.
	 *Kan ta inn argument fra brukeren som blir satt til maxIndex.
	 *
	 *@vegardds
	 */
	public static void main(String[] args) {
		try{
			maxIndex = Integer.parseInt(args[0]);
		} catch(Exception e){}
		
		System.out.println(n1);

		newNumber(n1, n2);
	}

	/*newNumber metode
	 *Returnerer int og tar inn to parametre, foerste og neste tall i tallrekken.
	 *Rekursiv metode som fortsetter til maxIndex er nadd.
	 *
	 *@vegardds
	 */
	public static int newNumber(int n1, int n2){
		System.out.println(n2);
		index++;
		if(n2<0)return n1;
		if(index == maxIndex) return n2;
		else return newNumber(n2, n1 + n2);
	}
}