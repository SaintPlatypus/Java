/**
 * Last8to10
 */
public class Last8to10 {

    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));//8
        System.out.println(trouble("451999277","41177722899"));//9
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
    }
    public static boolean doesRhyme(String str1, String str2) {//Проверяем на примитивные рифмы
		str1 = str1.replaceAll("\\p{Punct}",""); //Удаляем Пунктуацию
		str2 = str2.replaceAll("\\p{Punct}","");
		char lastletter=str1.charAt(str1.length()-1);
		char lastletter1=str2.charAt(str2.length()-1);
		
		if (Character.toLowerCase(lastletter1)==Character.toLowerCase(lastletter))
		    return true;
		else
			return false;
    }
    public static boolean trouble(String number1, String number2) {//2 повтор в 1 и 3 повтор в 2, и наоборт
		int count1 = 0;
		int count2 = 0;
		String currentChar = "";
		for (int i = 0; i < number1.length() - 1; i++) {
			currentChar = String.valueOf(number1.charAt(i));
			if (currentChar.equals(String.valueOf(number1.charAt(i + 1)))) 
			    count1++;
            else 
                count1 = 0;
			if (count1 == 2) {
				count2 = 0;
				for (int j = 0; j < number2.length(); j++) {
					if (currentChar.equals(String.valueOf(number2.charAt(j)))) 
					    count2++;
                    else 
                        count2 = 0;
                    if (count2 == 2) 
                        return true;
				}
			}
		}
		return false;
    }
    public static int countUniqueBooks(String book, Character end) {// возвращает общее количество уникальных символов
		Map<Character, Boolean> chars = new HashMap<Character, Boolean>();
		boolean parse = false;
		for (char c: book.toCharArray()) {
            if (parse && c != end) 
                chars.put(c, true);
			if (c == end) {
                if (parse) 
                    parse = false;
                else
                    parse = true;
			}
		}
		return chars.size();
	}
}