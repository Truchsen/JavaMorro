/*StringPlay
 *A program testing the toString() method.
 *
 *@vsoyseth
 */


class StringPlay{
	public static void main(String[] args) {
		SomeWord w = new SomeWord("Example");

		/*This works because the  toString() method is awesome!
		 *Even tough w is the type SomeWord, it will return a string in this context
		 */
		System.out.prinln(w);

		/*The problem however is if you want to use methods in the String class.
		 *You cannot call for example w.charAt(1), because its not a method in SomeWOrd.
		 *However you can call on the method toString() as underneath...
		 */
		System.out.println(w.toString().charAt(0));
	}
}

class SomeWord{
	private String word;
	
	public SomeWord(String word){
		this.word=word;
	}
	
	public String toString(){
		return word;
	}
}