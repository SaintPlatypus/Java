import java.util.*;
/**
 * FourTo7
 */
public class FourTo7 {

    public static void main(String[] args) {
        double[] babky = {9, 17, 30, 1.5};//4
        System.out.println(String.format("$%.2f",overTime(babky)));//4
        System.out.println(BMI("205 pounds", "73 inches"));//5
        System.out.println(bugger(999));//6
        System.out.println(toStarShorthand("abbccc"));//7
    }
    public static double overTime(double[] babky) { //Бабки, бабки, с**а, бабки!
        double dollars = 0.0;
        for(double i=babky[0]; i<babky[1]; i+=0.25){
			if(i<17){
				dollars += 0.25 * babky[2];
			}else if(i>=17){
				dollars += 0.25 * babky[2] * babky[3];
			}
		}
        return dollars;
    }
    public static String BMI(String weight, String height) { //Рост и вес
        String[] weig = weight.split(" ");
        String[] heig = height.split(" ");
        String result = "";

        double kilos = weig[1].equals("pounds") ? Double.parseDouble(weig[0]) * 0.453592 : Double.parseDouble(weig[0]);//Если weig[1]==pounds то (weig[0]) * 0.453592 иначе (weig[0])
        double meters = heig[1].equals("inches") ? Double.parseDouble(heig[0]) * 0.0254 : Double.parseDouble(heig[0]);

        double val = kilos / (meters * meters);
        val = Math.round(val * 10.0)/10.0;

        if (val < 18.5) 
            result += val+" Underweight";
        if (val >= 18.5 && val <= 24.5) 
            result += val + " Normal weight";
        if (val >= 25 && val <= 29.9) 
            result += val + " Overweight";
        if (val >= 30) 
            result += val + " Obesity";
        return result;
    }
    public static int bugger(int num) {//Мультифлекс постоянства( мультипликативное постоянство)
        int kolvo = 0;
        while (num > 9) { //Т.к. мультифлекс ток когда >1 числа 
            int temp = 1;
            while (num > 0) {
                temp *= num % 10;
                num /= 10;
            }
            num = temp;
            kolvo++;
        }
        return kolvo;
    }
    public static String toStarShorthand(String input) { //Nз много символов (ссссс) делаем один с пометкой об их количестве(с*5)
		String result = "";
		int count = 1;
		char currentChar = 0; 
		for (int i = 1; i < input.length(); i++) {
			currentChar = input.charAt(i - 1);
            if (currentChar == input.charAt(i)) 
                count++;
			else {
                if (count > 1) 
                    result += currentChar + "*" + count;
                else 
                    result += currentChar;
				count = 1;
                if (i == input.length() - 1) 
                    result += String.valueOf(input.charAt(input.length() - 1));
			}
		}
        if (count != 1) 
            result += currentChar + "*" + count;
		return result;
	}
}