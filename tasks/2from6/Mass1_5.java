import java.util.Arrays;

/**
 * Mass1_5
 */
public class Mass1_5 {
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5)); //1
        int[] a = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(a)); //2
        int[] b = {1, 2, 3, 4};
        System.out.println(isAvgWhole(b)); //3
        int[] c = {1, 2, 3, 4};
        System.out.println(Arrays.toString(cumulativeSum(c))); //4
        System.out.println(getDecimalPlaces("43.20")); //5
    }
    public static String repeat(String a, int rep){ //Повторение каждого символа
        String rep_a = "";
        for (int i = 0; i < a.length(); i++)
            for (int j = 0; j < rep; j++)
                rep_a += a.charAt(i); 
        return rep_a;
    }
    public static int differenceMaxMin(int[] a) { //Находит наименьшее и наибольшее число в массиве и выводит их разницу
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max)
                max = a[i];
            if (a[i]<min)
                min = a[i];           
        }
        System.out.printf("Smallest number is %d, biggest is %d. \ndifference ",min,max);
        return max-min;
    }
    public static boolean isAvgWhole(int[] a) { //Проверяет сумму массива на цело численность 
        int Summ = 0;
        for (int i = 0; i < a.length; i++)
            Summ += a[i];
        if (Summ % a.length == 0)
            return true;
        return false;
    }
    public static int[] cumulativeSum(int[] a) { //Вывод массив, в котором каждый эемент равен себе + сумма предыдущих 
        int[] new_mass = new int[a.length];
        int Summ = 0;
        for (int i = 0; i < a.length; i++) {
            Summ += a[i];
            new_mass[i] = Summ;
        }
        return new_mass;
    }
    public static int getDecimalPlaces(String a) {
        double b=Double.parseDouble(a);
		b=b%1;
		b=b*10;
		b=Math.floor(b);
		int c=(int)b;
		return c;
    }
}


