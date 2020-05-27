import java.util.*;
/**
 * Six6
 */
public class Six6 {
    public static void main(String[] args){
        ulam();// предварительно вычисляем последовательность чисел Улама
        int n = 9;
        System.out.println(arr.get(n - 1));
    } 

    static final int MAX = 1000;
    static Vector<Integer> arr = new Vector<Integer>();// Массив для хранения номера Улама
    static void ulam(){// Функция для вычисления номера ulam
        arr.add(1);// толкаем первые 2 два члена последовательности
        arr.add(2);
        // цикл для генерации числа Улама
        for (int i = 3; i < MAX; i++) {
            int count = 0;
            // пройти массив и проверить,
            // i могу быть представлен как сумма
            // два разных элемента массива
            for (int j = 0; j < arr.size() - 1; j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(j) + arr.get(k) == i)
                        count++;
                    if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            // Если число равно 2, это означает
            // i могу быть представлен как сумма
            // два разных члена последовательности
            if (count == 1) {
                // i номер улама
                arr.add(i);
            }

        }

    }

}
