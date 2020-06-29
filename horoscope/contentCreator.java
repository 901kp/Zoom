package horoscope;
import java.util.Random;

public class contentCreator {


    String[] starSigns = {"Pisces", "Aquarius", "Capricorn", "Sagittarius", "Scorpio", "Libra", "Virgo", "Leo", "Cancer", "Gemini", "Taurus", "Aries"};

    String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    
    String start= "You";

    String[] oneGroup = {"are", "will", "should"};

    String[] twoGroup = {"have"};

    String[] threeGroup = {"to have"};

    String[] fourGroup = {"no", "any", "some", "a little bit of"};

    String[] fiveGroup = {"plans", "work", "busy time", "fun"};

    String[] sixGroup;

    String getRandomWord(String[] array){
        int randomWord = new Random().nextInt(array.length);
        return array[randomWord];
    }

    String addWord(){
        String word = "";


        return word;
    }

}