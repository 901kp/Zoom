package horoscope;
import java.util.ArrayList;

public class fullHoroshope {

    contentCreator cc = new contentCreator();

    int numberOfSentences = 3;
    int numberOfCompletedSentences = 0;



    /*Creates an arrayList with random words from each group
    that are necessary to build the sentence.*/
    ArrayList<String> firstSentence(){
        int totalWords = 7;
        int numberOfWords;

        /*An array list to consist of the words for this sentence.*/
        ArrayList<String> sentenceOne = new ArrayList<String>();
        
        /*The first word in the first sentence is to be "You".*/
        sentenceOne.add(cc.start);
        
        /*Iterates through the number of words required and for each number
        add a word from the respective group.*/
        for (numberOfWords = 1; numberOfWords < totalWords; numberOfWords++){
            String word = cc.getRandomWord(cc.accessGroup(sentenceOne.size()+1));
            sentenceOne.add(word);
        }

        /*When all words chosen, the number of completed sentences
        is increased by 1, so is the sentence for contentCreator
        to focus on, and the sentence is returned.*/
        numberOfCompletedSentences++;
        cc.whichSentence++;
        return sentenceOne;
    }

    /*The same idea follows for both the second and third sentence.
    Although they don't start with a specific word.*/
    ArrayList<String> secondSentence(){
        int totalWords = 12;
        int numberOfWords;

        /*An array list to consist of the words for this sentence.*/
        ArrayList<String> sentenceTwo = new ArrayList<String>();

        for (numberOfWords = 0; numberOfWords < totalWords; numberOfWords++){
            String word = cc.getRandomWord(cc.accessGroup(sentenceTwo.size()+1));
            sentenceTwo.add(word);
        }
        
        numberOfCompletedSentences++;
        cc.whichSentence++;
        return sentenceTwo;
    }

    ArrayList<String> thirdSentence(){
        int totalWords = 15;
        int numberOfWords;

        /*An array list to consist of the words for this sentence.*/
        ArrayList<String> sentenceThree = new ArrayList<String>();

        for (numberOfWords = 0; numberOfWords < totalWords; numberOfWords++){
            String word = cc.getRandomWord(cc.accessGroup(sentenceThree.size()+1));            
            if (numberOfWords == 4){
                word = word + ",";
            }
            sentenceThree.add(word);
        }

        
        numberOfCompletedSentences++;
        cc.whichSentence++;
        return sentenceThree;
    }

    /*Uses an array of words to use in a sentence and transforms it into a sentence
    a proper sentence.*/
    String makeSentence(ArrayList<String> sentence) {
        String sent = "";
        int length = sentence.size();

        /*Iterates through each word in the arrayList and puts
        them into a sentence.*/
        for (int i = 0; i < length; i++){

            /*Takes the first word in an arrayList and makes sure the 
            first letter is capitalised.*/
            if (i == 0){
                String word = sentence.get(i);
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                sentence.set(i, word);
            }
            
            sent = sent + sentence.get(i);

            /*Checks whether it's the last word. If so, add a full stop
            and a space. If not, add a space.*/
            if (i == length-1){
                sent = sent + ". ";
            } else {
                sent = sent + " ";
            }
        }

        return sent;
    }


}