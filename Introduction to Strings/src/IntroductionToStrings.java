import java.util.Scanner;

public class IntroductionToStrings
	{

		public static void main(String[] args)
			{
				//useYourInsideVoice();
				//verticalLetters();
				//countTheVowels();
			}
		
		public static void useYourInsideVoice()
		{
			System.out.println("Type in any phrase in all caps.");
			Scanner userInput = new Scanner(System.in);
			String shoutedPhrase = userInput.nextLine();
			System.out.println(shoutedPhrase.substring(0,1) + shoutedPhrase.substring(1).toLowerCase());
		}
		
		public static void verticalLetters()
		{
			System.out.println("Type in any phrase in.");
			Scanner userInput = new Scanner(System.in);
			String userPhrase = userInput.nextLine();
			for(int i = 0; i<userPhrase.length(); i++)
				{
					System.out.println(userPhrase.charAt(i));
				}
		}
		
		public static void countTheVowels()
		{
			System.out.println("Input a sentence.");
			Scanner userInput = new Scanner(System.in);
			String userSentence = userInput.nextLine();
			int vowelCount = 0;
			for(int i = 0; i<userSentence.length(); i++)
				{
					userSentence.substring(i, i+1);
					switch(userSentence.substring(i, i+1))
					{
						case"a":
						case"e":
						case"i":
						case"o":
						case"u":
						case"A":
						case"E":
						case"I":
						case"O":
						case"U":
								vowelCount++;
					}
					

				}
			if (vowelCount==1)
				System.out.println("There is " + vowelCount + " vowel in your sentence.");
			else
				System.out.println("There are " + vowelCount + " vowels in your sentence.");
			}
		
		
	}
	
