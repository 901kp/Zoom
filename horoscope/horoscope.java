package horoscope;
//import java.util.Arrays;

public class horoscope {
    public static void main(String[] args){
        
        /*Creates object of the sign class to acquire the star sign.*/
        sign sign = new sign();
        fullHoroshope hor = new fullHoroshope();
        String starSign = sign.getSign();

        System.out.println("Star sign is " + starSign + ".");

        System.out.print(hor.makeSentence(hor.firstSentence()));
        System.out.print(hor.makeSentence(hor.secondSentence()));
        System.out.println(hor.makeSentence(hor.thirdSentence()));

    }
}