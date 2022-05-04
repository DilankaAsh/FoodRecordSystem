import java.util.*;

public class MaxOccurCharacter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word.");
		String character = input.nextLine();
		input.close();
		System.out.print(
				"First appearing max occuring character including 'spaces' is " + " ' " + maxCharIs(character) + " '");

	}

	public static char maxCharIs(String character) {
		character = character.toLowerCase();

		HashMap<Character, Integer> characterSequences = new HashMap<Character, Integer>();
		HashMap<Character, Integer> characterPosition = new HashMap<Character, Integer>();
		Character currentMaxCharacter = null;
		int currentMaxCharacterCount = 0;

		for (int i = 0; i < character.length(); i++) {

			Character letter = character.charAt(i);

			if (!characterPosition.containsKey(letter)) {
				characterPosition.put(letter, i);
			}

			characterSequences.put(letter, characterSequences.getOrDefault(letter, 0) + 1);

			if (currentMaxCharacterCount < characterSequences.getOrDefault(letter, 0)) {
				currentMaxCharacter = letter;
				currentMaxCharacterCount = characterSequences.getOrDefault(letter, 0);

			} else if (currentMaxCharacterCount == characterSequences.getOrDefault(letter, 0)) {

				if (characterPosition.get(currentMaxCharacter) > characterPosition.get(letter)) {
					currentMaxCharacter = letter;
				}

			}

		}

		return currentMaxCharacter;

	}
}
