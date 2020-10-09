package password;

import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		System.out.println(generator());
	}
	
	public static String generator() {
		Random rand = new Random();
		String password = "";
		int n = 0;
		while(n < 3) {
			password += rand.nextInt(10);
			password += Character.toString((char) (rand.nextInt(26)+'a'));
			n++;
		}
		return password;
	}
}
