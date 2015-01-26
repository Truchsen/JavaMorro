
public class lht  {
	String cardNum;
	int checkDigit;
	int length;

	public lht (String n){
		cardNum = n;
		length = n.length();
		checkDigit = Character.getNumericValue(cardNum.charAt(length-1));
		check(cardNum, length);
	}
	
	public void check (String n, int l){
		int [] container = new int [l/2];
		int doubl;
		int p = 0;
		int soc = 0;
		int sum = 0;

		if (l != 15) {
			
			for (int i=0;i<length; i+=2) {
				doubl = Character.getNumericValue(n.charAt(i))*2;
				
				if (doubl >= 10){
					doubl -= 9;
					
				}
				container[p] = doubl;
				p++;
			}

		} else {
			
			for (int i=1;i<length; i+=2) {
				doubl = Character.getNumericValue(n.charAt(i))*2;
				
				if (doubl >= 10){
					doubl = (doubl%10)+1;
					
				}
				container[p] = doubl;
				p++;
				
			}
		}
		for (int i = 0; i<container.length; i++) {
			soc += container[i];
		}

		if (l == 16) {
			for (int i = 1; i<l-1; i+=2){
			sum += Character.getNumericValue(n.charAt(i));
			}	
		} else {
			
			for (int i = 0; i<l-1; i+=2){
			sum += Character.getNumericValue(n.charAt(i));
			
			}
		}
		sum = (sum + soc)*9;

		if(sum%10 == checkDigit){
			System.out.println(" Last digit of sum " + sum + " equals checkdigit " + checkDigit);	
		} else {
			System.out.println("U fake ");
		}
		
	}
}