/* 
 * The Luhn algorithm or mod10 (modulus 10) makes it possible to check any credit card
 * and a few other number based identification systems. Inspired by an assignement in CS50
 * I wanted to implement the credit card test in a java system.
 *

 * Based on my quick research the mod10 algorithm is depending on the length and issuer (VISA, AmEx etc.).
 * I will focus on VISA, AmEx and mastercard in this test-program, if I have got this right there should
 * not be any problems using this test on any other credit card. But there is about as many "how-tos" on 
 * credit card validity tests as there are credit cards...
 * 
 * So, we have a credit card number 4539258496568078 (VISA).
 * What we need to do is basically six steps
 *	1. Take the the last digit (8) out of the sequence. This is our check digit
 *	2. Double every other digit starting from the right (453925849656807)
 *		which is(43289587) = 8,6,4,16,18,10,16,14
 *	3. Sum the digits of the products (14=1+4=5, 16=1+6=7, 10=1+0=1, 18=1+8=9, 16=1+6=7)
 *	4. Add all the digits together 8+5+6+9+4+5+7+4+9+6+1+6+7+0+5 = 82
 *	5. Multiply the result by 9 (82*9=738)
 *	6. Take the last digit of this result and match it with the check digit (73(8) = 8)
 * If the last digit and the check digit matches it is likely that the credit card is legit
 *
 * 
 * The method is the same for all of them,
 * but there are differences regarding the lenght of the card numbers.
 * AmEx is 15 digits long
 * VISA is 13 or 16 
 * and Mastercard is 16 digits long, but I will just make it test the basic 15 and 16 digits.
 */
public class luhntest {
	public static void main(String[] args) {
		new lht ("347832046496426");
		new lht ("371642575069471");
		new lht ("347469757698021");
		new lht ("345483316996513");
		new lht ("341447869763871");
		
		new lht ("4532414783685722");
		new lht ("4532995629194770");
		new lht ("4381233030342107");
		new lht ("4716070867497182");
		new lht ("4532493255322162");

		new lht ("5543823233944949");
		new lht ("5341713565265225");
		new lht ("5560867196931169");
		new lht ("5128981659946054");
		new lht ("5572305300015799");
		




	}
}
