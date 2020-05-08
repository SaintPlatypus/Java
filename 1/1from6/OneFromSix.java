import java.util.Scanner;

/**
 * InnerOneFromSix
 */
public class OneFromSix {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
      
//Возвращение остатка
        System.out.println("\nRemainder");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        System.out.println(remainder(a1, b1));

//Площадь треугольника
        System.out.println("\nS Triangle");
        System.out.printf("base ");
        int o = in.nextInt();
        System.out.printf("height ");
        int h = in.nextInt();
        System.out.println(triArea(o, h));
     
//Количество ног
        System.out.println("\nAnimals");
        System.out.printf("chickens ");
        int ch = in.nextInt();
        System.out.printf("cows ");
        int cows = in.nextInt();
        System.out.printf("pigs ");
        int pigs = in.nextInt();
        System.out.println(animals(ch, cows, pigs));

//Profitable Gamble
        System.out.println("\nProfitable Gamble");
        System.out.printf("prob ");
        double prob = in.nextDouble();
        System.out.printf("prize ");
        double prize = in.nextDouble();
        System.out.printf("pay ");
        double pay = in.nextDouble();
        System.out.println(profitableGamble(prob, prize, pay));  
 
//Сложение, вычитание, умножение диление
        System.out.println("\nOperators");
        System.out.printf("N ");
        int N = in.nextInt();
        System.out.printf("a ");
        int a = in.nextInt();
        System.out.printf("b ");
        int b = in.nextInt();
        System.out.println(operation(N, a, b)); 

//ACSII
        System.out.println("\nACSII");
        System.out.printf("Symbol ");
        String ACS = in.next();
        System.out.println(ctoa(ACS));

//Факториал
        System.out.println("\nFucktorial");
        System.out.printf("Num ");
        int F = in.nextInt();
        System.out.println(addUpTo(F));

//Третья сторона
        System.out.println("\nThird side");
        System.out.printf("a ");
        int a2 = in.nextInt();
        System.out.printf("b ");
        int b2 = in.nextInt();
        System.out.println(nextEdge(a2, b2));

//Cумма кубического массива
        System.out.println("\nMass");
        System.out.printf("Mass 3 4 5 \n");
        int mass[] = {3,4,5};
        System.out.println(sumOfCubes(mass));

// +A B раз и на С
        System.out.println("\nABC");
        System.out.printf("A ");
        int a3 = in.nextInt();
        System.out.printf("B ");
        int b3 = in.nextInt();
        System.out.printf("C ");
        int c3 = in.nextInt();
        System.out.println(abcmath(a3, b3, c3));
    }
    public static int remainder(int a, int b) { //Возвращение остатка
        int c = a % b;
        return c;
    }
    public static int triArea(int o, int h) { //Площадь треугольника
        int S = o * h/2;
        return S;
    }
    public static int animals(int ch, int cows, int pigs) { //Количество ног
        int kolvo = ch*2 + cows*4 + pigs*4;
        return kolvo;
    }
    public static boolean profitableGamble(double prob, double prize, double pay) { //iff
        if ((prob*prize)>pay) return true;
        return false;
    }
    public static String operation(int N, int a, int b) { //Сложение, вычитание, умножение диление
        if (a+b == N) 
            return "to fold";
        else if (a-b == N) 
            return "subtract";
        else if (a*b == N)
            return "multiply";
        else if (a/b == N)
            return "split up";
        else 
            return "none";
    }
    public static int ctoa(String ACS) { //ACSII
        char ACSII = ACS.charAt(0);
        return (int)ACSII;
    }
    public static int addUpTo(int F){ //Факториал
        int Summ = 0;
        for (int i = 1; i <= F; i++) Summ += i;
        return Summ;
    }
    public static int nextEdge(int a, int b) { //Третья сторона 
        int c = a + b - 1;
        return c;
    }
    public static int sumOfCubes(int[] mass) { //Cумма кубического массива
        int Summ = 0;
        for (int i = 0; i < mass.length; i++)
            Summ += Math.pow(mass[i], 3);  
        return Summ;
    }
    public static boolean abcmath(int a, int b, int c) {    // числа А складываеться B раз и проверяем
                                                            //делиться ли на С 
        for (int i = 0; i < b; i++) a += a;
        if ((a%c)==0)
            return true;
        return false;
    }
}