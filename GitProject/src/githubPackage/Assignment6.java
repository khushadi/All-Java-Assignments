package githubPackage;

public class Assignment6 {

	public static void main(String[] args) {
		// Palindorme words: mom, dad, madam, bob, noon radar, level

		String palWord = "level";
		String reverse = "";

		for(int i = palWord.length()- 1; i >=0; i--) {
			reverse += palWord.charAt(i);
		
		}
		boolean palindorme  = true;
		for(int i = 0; i<palWord.length(); i++) {
			if(palWord.charAt(i) != reverse.charAt(i))
				palindorme = false;
		}

		if(palindorme) {
			System.out.println(palWord+" is palindorme ");
		}else {
			System.out.println(palWord+" not Palindorme ");
		}
	}
}