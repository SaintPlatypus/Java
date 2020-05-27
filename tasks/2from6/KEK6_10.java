/**
 * KEK6_10
 */
public class KEK6_10 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(12)); //6
        System.out.println(isValid("8841"));//7
        System.out.println(isStrangePair("shrek", "keks"));//8
        System.out.println(isSuffix("arachnophobia", "-phobia"));//9
        System.out.println(isPrefix("automation", "auto-"));//9
        System.out.println(boxSeq(4));//10
    }
    public static int Fibonacci(int a) { //число по Фибоначи
        int fib = 1;
        int c = 1;
        int b = 1;
        for (int i = 2; i <= a; i++){ 
            fib = c + b;
            b = c;
            c = fib;
        }
        return fib;
    }
    public static boolean isValid(String a) {  //Емаил адрессс
        if (a.length()>=5)
			return false;
	    try {
			int number = Integer.parseInt(a);
			return true;
		}
		catch(Exception e) {
			return false;
		}
    }
    public static boolean isStrangePair(String a, String b) { //Проверяем на странную пару
        if ((a.charAt(0)==b.charAt(b.length()-1))&&(a.charAt(a.length()-1)==b.charAt(0)))
            return true;
        return false;
    }
	public static boolean isSuffix(String word, String suf) { //Проверяем суффикс
		suf = suf.replace("-", "");//убираем -
		int raz = word.length() - suf.length();
		for (int i = raz; i < suf.length(); i++)
			if (suf.charAt(i - raz) == word.charAt(i))
				continue;
			else 
				return false;
		return true;
	}
	public static boolean isPrefix(String word, String pref) { //Проверяем на префикс
		pref = pref.replace("-", "");//убираем -
		for (int i = 0; i < pref.length(); i++)
			if (pref.charAt(i) == word.charAt(i))
				continue;
			else
				return false;
		return true;
    }    
    public static int boxSeq(int step) {
        if (step % 2 != 0)
                return step+2;
            return step;
        }
}