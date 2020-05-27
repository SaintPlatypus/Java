/**
 * Six8
 */
public class Six8 {

    public static void main(String[] args) {
        System.out.println(convertToRoman(1488));
    }
    public static String convertToRoman(int a) {
        String rez = "";
        if(a<0 || a>3999) 
            return "Error";
        String[] oneDigit = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] desDigit = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] soDigit = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tDigit = {"","M","MM","MMM"};
        if(a < 10)
            return oneDigit[a];
        if(a>=10 && a<=99){
            rez += desDigit[a/10];
            rez += oneDigit[a%10];
            return rez;
        }
        if(a>=100 && a<=999){
            rez += soDigit[a/100];
            rez += desDigit[a%100/10];
            rez += oneDigit[a%10];
            return rez;
        }
        else{
            rez += tDigit[a/1000];
            rez += soDigit[a%1000/100];
            rez += desDigit[a%100/10];
            rez += oneDigit[a%10];
            return rez;
        }
    }
}