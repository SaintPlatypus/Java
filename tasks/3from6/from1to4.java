/**
 * from1to4
 */
public class from1to4 {

    public static void main(String[] args) {
        System.out.printf("has %d solutions.\n",solutions(1, 0, 1));//1
        System.out.println(findZip("all zip files are zipped"));//2
        System.out.println(checkPerfect(28));//3
        System.out.println(flipEndChars("Cat, dog, and mouse."));//4
    }
    public static int solutions(double a, double b, double c) {//Количество ответов в квадратном уравнении
        double D = Math.pow(b, 2) - 4*a*c; //Дискриминант
        if (D>0)
            return 2;
        if (D==0)
            return 1;
        else
            return 0;
    }
    public static int findZip(String a) { //ищем зип
        if (a.lastIndexOf("zip") == a.indexOf("zip"))
            return -1;
        return a.lastIndexOf("zip");
    }
    public static boolean checkPerfect(int n) { // Проверяем число на соверщенство
		int result = 0;
		for (int i = 1; i < n; i++)
			if (n % i == 0)
				result += i;
			if (result > n)
				return false;
		return (result == n);	
    }
    public static String flipEndChars(String s) { //Первая и последняя буква меняются местами
        if(s.length()<2)//Проверяем на длину строки
			return "Incompatible.";
		if(s.charAt(0)==s.charAt(s.length()-1))
			return "Two's a pair.";
		char[] chars = s.toCharArray();//превращаем строку в массив чаров 
		char a=chars[0];
		chars[0]=chars[s.length()-1];
		chars[s.length()-1]=a;
		return String.valueOf(chars);
    }
}