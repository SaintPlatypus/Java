import java.util.*;

/**
 * From5to10
 */
public class From5to10 {

    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));//5
        int[] arr1={1, 3, 4, 4, 4};//6
        int[] arr2={2, 5, 7};//6
        System.out.println(same(arr1,arr2));//6
        System.out.println(isKaprekar(297));//7
        System.out.println(longestZero("00010100000011"));//8
        System.out.println(nextPrime(8));//9
        System.out.println(rightTriangle(3,4,5));//10
    }
    public static boolean isValidHexCode(String s) { //Проверяем на возможность 16-тиричный код
        String[] Alfa = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "A", "B", "C", "D", "E", "F","a", "b", "c", "d", "e", "f"}; //Значения которые могут быть в 16-ричном коде
        List<String> list=Arrays.asList(Alfa);
        Character s1=s.charAt(0);
        if((s.length()==7) && s1=='#'){
            for (int i = 1; i < s.length(); i++)
                if (list.contains(Character.toString(s.charAt(i))))
                    continue;
                else
                    return false;
            return true;
        }
        return false;
        }
    public static boolean same(int[] arr1, int[] arr2) { //Проверяем на схожию длину по уникалности
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
            list1.add(arr1[i]);
        for(int i=0;i<arr2.length;i++)
            list2.add(arr2[i]);
        for(int i=0;i<list1.size();i++)
                for(int j=1;j<arr1.length;j++)
                    if (arr1[i]==arr1[j]&&(i!=j)) 
                        list1.remove(i);
        for(int i=0;i<list2.size()-1;i++)
                for(int j=1;j<arr2.length;j++)
                    if (arr2[i]==arr2[j]&&(i!=j)) 
                        list2.remove(i);
        if(list1.size()==list2.size())
            return true;
        return false;
    }
    public static boolean isKaprekar(int a) { //Число Капрекара
        String result = String.valueOf((int)Math.pow(a, 2));
		int num1;
		int num2;
        if (result.length() == 1) 
            num1 = 0;
        else 
            num1 = Integer.parseInt(result.substring(0, (int)(result.length() / 2)));
		num2 = Integer.parseInt(result.substring((int)(result.length() / 2)));
		return num1 + num2 == a;
    }
    public static String longestZero(String s) { //Выводим самую длинную связку нулей
        int count = 0;
		int a = 0;
		String result = "";
		for (int i = 0; i < s.length(); i++){
			if (Character.toString(s.charAt(i)).equals("0"))
				a++;
			else 
				a = 0;
			if (a > count) 
				count=a;
        }
		for (int i = 0; i < count; i++)
			result += "0";
		return result;      
    }
    public static int nextPrime(int a){ //Находим следующие число на простату
        boolean isComposite = false;
        int nextNum = a; 
        while (true) {
            isComposite = true;
            for (int i = 2; i < nextNum; i++)
				if (nextNum % i == 0) 
					isComposite = false;
            if (isComposite) 
                return nextNum;
            nextNum++;
        }
    }
    public static boolean rightTriangle(int a, int b, int c) {
        int[] arr = {a, b, c};
            Arrays.sort(arr);
            return (Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == arr[2]);
        }
}