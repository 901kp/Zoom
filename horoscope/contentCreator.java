package horoscope;
import java.util.Random;

/*The class creating the contents fill the sentences for the horoscope.
Includes groups of words (when accessed, a randomly chosen word is given,
a method for choosing a random word out of a provided array of Strings,
and a method deciding which group to access depending on which word in
order is needed and which sentence.*/

public class contentCreator {

    int whichSentence = 1;

    //Arrays providing star sign and planet names
    String[] starSigns = {"Pisces", "Aquarius", "Capricorn", "Sagittarius", "Scorpio", "Libra", "Virgo", "Leo", "Cancer", "Gemini", "Taurus", "Aries"};

    String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    
    //Arrays providing words to create sentences, reasonably ordered
    String start= "You";
    
    String[] Group1 = {"will", "should", "might", "could"};

    String[] Group2 = {"all in all, a good day for", "all in all, a bad day for"};

    String[] Group3 = {"memories", "consequences", "results"};

    String[] Group4 = {"no", "some", "a little bit of", "more"};
    
    String[] Group5 = {"organised plans", "work", "keeping the busy times to minimum", "fun", "productivity", "procrastination", "rest", "relaxation"};

    String[] Group6 = {"positive", "negative", "good", "bad", "happy", "sad", "torturous", "wonderful", "exciting"};

    String[] Group7 = {"provoke", "cause", "lead", "evoke", "summon"};

    String[] Group8 = {"they"};
    
    String[] Group9 = {"of"};

    String[] Group10 = {"aware", "careful", "cautious"};
    
    String[] Group11 = {"more", "less", "more often", "less often", "regularly", "once a week", "only a little bit everyday", "a little bit", "a lot"};
    
    String[] Group12 = {"over", "for"};
    
    String[] Group13 = {"the next month", "the nearest weeks", "the next few days", "the next week"};
    
    String[] Group14 = {"find yourself"};
    
    String[] Group15 = {"procrastinating", "working", "sleeping", "resting", "having free time", "enjoying yourself", "learning something new"};

    String[] Group16 = {"be"};
    
    String[] Group17 = {"can"};
    
    String[] Group18 = {"help", "minimise", "limit", "increase", "maximise", "stop", "pause"};
    
    String[] Group19 = {"your"};
    
    String[] Group20 = {"skill of", "need for", "wish for", "preference for"};
    
    String[] Group21 = {"which"};
    
    String[] Group22 = {"a fimiliar", "a known", "a close", "an unknown", "a just met", "an exciting", "a long known"};

    String[] Group23 = {"afftect"};

    String[] Group24 = {"positively", "negatively", "in a good way", "in a bad way"};


    //Provided with a String array, returns a random String out of the array
    String getRandomWord(String[] array){
        int randomWord = new Random().nextInt(array.length);
        return array[randomWord];
    }

    /*Checks which word in the array is needed and for which sentence,
    therefore which word group to access to get a random word.*/
    String[] accessGroup(int length){
        
        switch(length){
            case 1:
                if (whichSentence == 2){
                    return planets;
                } else {
                    return Group16;
                }
            case 2:
                if (whichSentence == 1){
                    return Group1;
                } else if (whichSentence == 3){
                    return Group10;
                } else {
                    return Group17;
                }
            case 3:
                if (whichSentence == 1){
                    return Group14;
                } else if (whichSentence == 3){
                    return Group9;
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
                } else if (whichSentence == 3){
                    return Group8;
                } else {
                    return Group5;
                }
            case 7:
                if (whichSentence == 1){
                    return Group13;
                } else if (whichSentence == 3){
                    return Group1;
                } else {
                    return Group21;
                }
            case 8:
                if (whichSentence == 1){
                    return Group4;
                } else if (whichSentence == 3){
                    return Group7;
                } else {
                    return Group22;
                }
            case 9:
                if (whichSentence == 3){
                    return Group4;
                } else {
                    return starSigns;
                }
            case 10:
                if (whichSentence == 3){
                    return Group6;
                } else {
                    return Group1;
                }
            case 11:
                if (whichSentence == 3){
                    return Group3;
                } else {
                    return Group23;
                }
            case 12:
                if (whichSentence == 3){
                    return Group2;
                } else {
                    return Group24;
                }
            default:
                return starSigns;
        }
    }

}