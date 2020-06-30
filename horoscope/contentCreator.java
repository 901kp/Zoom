package horoscope;
import java.util.Random;

public class contentCreator {

    //Arrays providing star sign and planet names
    String[] starSigns = {"Pisces", "Aquarius", "Capricorn", "Sagittarius", "Scorpio", "Libra", "Virgo", "Leo", "Cancer", "Gemini", "Taurus", "Aries"};

    String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    
    //Arrays providing words to create sentences, reasonably ordered
    String start= "You";

    String[] oneGroup = {"are", "will be", "should be"};

    String[] twoGroup = {"was", "is", "will be"};

    String[] threeGroup = {"were", "are", "will be"};

    String[] fourGroup = {"no", "any", "some", "a little bit of", "more"};

    String[] fiveGroup = {"plans", "work", "busy time", "fun"};

    String[] sixGroup = {"must", "can't", "can", "must not", "should", "couldn't", "shouldn't"};

    String[] sevenGroup = {"procrastinate", "work", "clean", "rest", "sleep", "visit family or friends"};

    //Providing a string array, return a random word
    String getRandomWord(String[] array){
        int randomWord = new Random().nextInt(array.length);
        return array[randomWord];
    }

    String addWord(String[] array){
        String word = "";

        return word;
    }

}