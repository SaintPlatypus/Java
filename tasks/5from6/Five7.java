/**
 * Five7
 */
public class Five7 {

    public static void main(String[] args) {
        System.out.println(numToEng(900));
    }
    private static String numToEng(int a){//Nз числа в его название
        if(!(a >= 0 && a <= 999)) 
            return "Error";
        String s = "";
        String[] units = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] tens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        String[] dozens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] hundred = {"","one hundred","two hundred","three hundred","four hundred","five hundred",
                "six hundreds","seven hundred","eight hundred","nine hundred"};
        if(a < 10)
            return units[a];
        if(a>= 10 && a <= 20) 
            return tens[a-10];
        if(a % 100 == 0)
            return hundred[a/100];        
        if(a>20 && a<100)
            s += dozens[a/10] + " " + units[a%10];
        else
            s += hundred[a/100] + " " + dozens[a%100/10] + " " + units[a%10];
        return s;
    }
}