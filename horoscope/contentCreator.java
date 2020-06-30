package horoscope;
import java.util.Random;

public class contentCreator {

    int whichSentence = 1;

    //Arrays providing star sign and planet names
    String[] starSigns = {"Pisces", "Aquarius", "Capricorn", "Sagittarius", "Scorpio", "Libra", "Virgo", "Leo", "Cancer", "Gemini", "Taurus", "Aries"};

    String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    
    //Arrays providing words to create sentences, reasonably ordered
    String start= "You";
    //
    String[] Group1 = {"will", "should", "might", "could"};

    String[] Group2 = {"was", "is", "will be"};

    String[] Group3 = {"were", "are", "will be"};

    String[] Group4 = {"no", "any", "some", "a little bit of", "more"};
    //
    String[] Group5 = {"organised plans", "work", "keeping the busy times to minimum", "fun", "productivity", "procrastination", "rest", "relaxation"};

    String[] Group6 = {"must", "can't", "can", "must not", "should", "couldn't", "shouldn't"};

    String[] Group7 = {"procrastinate", "work", "clean", "rest", "sleep", "visit family or friends"};
    //
    String[] Group8 = {"wants", "needs", "allows", "helps"};
    //
    String[] Group9 = {"you"};
    //
    String[] Group10 = {"to"};
    //
    String[] Group11 = {"more", "less", "more often", "less often", "regularly", "once a week", "only a little bit everyday", "a little bit", "a lot"};
    //
    String[] Group12 = {"over", "for"};
    //
    String[] Group13 = {"the next month", "the nearest weeks", "the next few days", "the next week"};
    //
    String[] Group14 = {"find yourself"};
    //
    String[] Group15 = {"procrastinating", "working", "sleeping", "resting", "having free time", "enjoying yourself", "learning"};
    //
    String[] Group16 = {"for"};
    //
    String[] Group17 = {"can"};
    //
    String[] Group18 = {"help", "minimise", "limit", "increase", "maximise", "stop", "pause"};
    //
    String[] Group19 = {"your"};
    //
    String[] Group20 = {"skill of", "need for", "wish for", "preference for"};
    //
    String[] Group21 = {"which"};
    //
    String[] Group22 = {"a fimiliar", "a known", "a close", "an unknown", "a just met", "an exciting", "a long known"};

    String[] Group23 = {"afftect"};

    String[] Group24 = {"positively", "negatively", "in a good way", "in a bad way"};

    String[] Group25 = {"be"};

    String[] Group26 = {"aware", "careful", "cautious"};
    
    String[] Group27 = {"of"};

    //Providing a string array of the, return a random word
    String getRandomWord(String[] array){
        int randomWord = new Random().nextInt(array.length);
        return array[randomWord];
    }

    /*Checks which word in the array is needed, therefore which
    word group to access to get it.*/
    String[] accessGroup(int length){
        
        switch(length){
            case 1:
                if (whichSentence == 2){
                    return planets;
                } else {
                    return Group25;
                }
            case 2:
                if (whichSentence == 1){
                    return Group1;
                } else if (whichSentence == 3){
                    return Group26;
                } else {
                    return Group17;
                }
            case 3:
            if (whichSentence == 1){
                return Group14;
            } else if (whichSentence == 3){
                return Group27;
            } else {
                return Group18;
            }
            case 4:
            if (whichSentence == 1){
                return Group15;
            } else if (whichSentence == 3){
                return Group22;
            } else {
                return Group19;
            }
            case 5:
            if (whichSentence == 1){
                return Group11;
            } else if (whichSentence == 3){
                return starSigns;
            } else {
                return Group20;
            }
            case 6:
            if (whichSentence == 1){
                return Group12;
            } else {
                return Group5;
            }
            case 7:
            if (whichSentence == 1){
                return Group13;
            } else {
                return Group21;
            }
            case 8:
            if (whichSentence == 1){
                return Group4;
            } else {
                return Group22;
            }
            case 9:
                return starSigns;
            case 10:
                return Group1;
            case 11:
                return Group23;
            case 12:
                return Group24;
            case 13:
                return Group25;
            case 14:
                return Group26;
            
            default:
                return starSigns;
        }
    }

}