package exercise6_lab13;

public class TranslatorForText {

	public static String TranslatorText(int translateTo) {
		// TODO Auto-generated method stub
		if (translateTo == 1)
		{
		   String EnglishWord = "Thank You";
		   return EnglishWord;
		} 
		if (translateTo == 2)
		{
		   String BahasaMalaysia = "Terima Kasih";
		   return BahasaMalaysia;
		}
		if (translateTo == 3)
		{
		   String Arabic = " شكرا لك";
		   return Arabic;
		}
		if (translateTo == 4)
		{
		   String Hangul = "감사합니다 ";
		   return Hangul;
		}
		else
		{
			return "The language is not available";
		}
	}
}

