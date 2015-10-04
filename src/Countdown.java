/**
 * Created by painter on 9/9/15.
 */
public class Countdown {

    public static String pattern( int n){
    	/*
    	 * This was my original code
    	 * 
    	if (n < 1) {
    		return "";
    	}
    	int loop1 = 0;
    	int loop2 = 0;
    	int loop3 = n;
    	int loop4 = n;
    	int loop5 = n;
    	int int1;
    	String string1 = "";
    	while (loop1 < n) {
    		loop1++;
    		loop2 = 0;
    		loop4 = loop5;
    		while (loop2 < loop3) {
    			int1 = loop4;
    			string1 = string1 + Integer.toString(int1);
    			loop2++;
    			loop4--;
    		}
    		loop3--;
    		string1 = string1 + "\n";
    		loop5--;
    	}
    	return string1;
    	*/
    	String string1 = "";
    	for(int j=n; j>0; j--) {
    		for(int i=j; i>0; i--) {
    			string1 += i;
    		}
    		string1 += "\n";
    	}
    	return string1;
    }

    public static void main(String[] args){

        System.out.println("Hello");
        System.out.println("You can use this method to test your work and see output");
        System.out.println("Don't forget to also use the Tests");
        System.out.print(pattern(4));
    }
}
