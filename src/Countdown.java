/**
 * Created by painter on 9/9/15.
 */
public class Countdown {

    public static String pattern( int n){
    	if (n < 1) {
    		return "";
    	}
    	String end = "";
		if (n >= 10) {
			end = end + "10987654321\n";
		}
		if (n >= 9) {
			end = end + "987654321\n";
		}
		if (n >= 8) {
			end = end + "87654321\n";
		}
		if (n >= 7) {
			end = end + "7654321\n";
		}
		if (n >= 6) {
			end = end + "654321\n";
		}
		if (n >= 5) {
			end = end + "54321\n";
		}
		if (n >= 4) {
			end = end + "4321\n";
		}
		if (n >= 3) {
			end = end + "321\n";
		}
		if (n >= 2) {
			end = end + "21\n";
		}
		if (n >= 1) {
			end = end + "1\n";
		}
		return end;
    }

    public static void main(String[] args){

        System.out.println("Hello");
        System.out.println("You can use this method to test your work and see output");
        System.out.println("Don't forget to also use the Tests");
        System.out.print(pattern(4));
    }
}