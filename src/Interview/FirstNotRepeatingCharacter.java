package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNotRepeatingCharacter {

	public static void main(String[] args) {
		String s = "abacabad";
		System.out.println(firstNotRepeatingCharacter(s));
	}
	
	static char firstNotRepeatingCharacter(String s) {
		char output = '_';
		
		int count[] = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)-97]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i)-97] == 1) {
				return s.charAt(i);
			}
		}
		return output;
	}
}
