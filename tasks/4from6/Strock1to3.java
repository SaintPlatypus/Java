import java.util.*;

/**
 * Strock1to3
 */
public class Strock1to3 {

    public static void main(String[] args) {
//1задача
        Scanner in = new Scanner(System.in);
        System.out.printf("n: ");   //Количество слов
        int n = Integer.parseInt(in.nextLine());    //Конверт стринг в инт
        System.out.printf("k: ");   //Количество слов в строке
        int k = Integer.parseInt(in.nextLine());
        System.out.printf("String: ");
        String txt = in.nextLine();
        System.out.println(essa(n,k,txt));
//-----------------------------------------------------------------------------
        System.out.println(Arrays.toString(split("((())())(()(()()))")));//2
        System.out.println(toSnakeCase("helloEdabit"));//3
        System.out.println(toCamelCase("hello_edabit"));//3
    }
    public static String essa(int n, int k, String txt) { //Ессе для девочки, а вообще нужно стараться над почерком
        String[] words = txt.split(" "); //Разделяем все по буховке
        String currentString = ""; //Строка
		String result = ""; // Собстн результат будущий
        if (n > words.length)
            return "Wrong. Can't create essay";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (currentString.replace(" ", "").length() + word.length() <= k) //Если длина строки без пробела + длина слова < k 
				currentString += word + " "; // то в траке + слово
			else {
				result += currentString + "\n"; // иначе строку в результат
				currentString = word + " ";// и по новой
			}
		}
		if (currentString.length() > 0)
			result += currentString + "\n";
        return result;
    }
    public static String[] split(String str) { //Кластер скобок
		List<String> list = new ArrayList<>();
		int count = 0;  //Считаем количество открывающих скобочек 
		int lastIndex = 0;//Границы открытия
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				count++;
			else
				count--;
			if (count == 0){
				list.add(str.substring(lastIndex, i + 1));//Подстроку с полным набором скобок записываем в список
                lastIndex = i + 1;
            }
		}
		String[] strs = new String[list.size()];
		return strs = list.toArray(strs);
    }
    
    public static String toCamelCase(String str) {//Убираем нижние подчеркивание
		String []arr=str.split("_");
		String new_str=arr[0];
		for(int i=1;i<arr.length;i++) {
			new_str+=(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1));
		}	
		return new_str;
	}

	public static String toSnakeCase(String str) {//Разделяем по нижним подчеркиваниям
		String new_str="";
		for(int i=0;i<str.length()-1;i++)
			if(str.substring(i,i+1).matches("[A-Z]")) {
				new_str=new_str + "_" + str.substring(i,i+1).toLowerCase();
			}else {
				new_str+=str.substring(i,i+1);
			}
		new_str+=str.substring(str.length()-1);
		return new_str;
	}
}