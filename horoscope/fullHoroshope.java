package horoscope;

public class fullHoroshope {
    contentCreator cc = new contentCreator();

    String[] firstSentence(){
        String[] sent = new String[8];
        sent[0] = cc.start;
        int numberOfWords = 1;
        while (numberOfWords < 8){
            sent[numberOfWords] = cc.getRandomWord(cc.oneGroup);
            numberOfWords++;
        }
        return sent;
    }

    String makeSentence(String[] array){
        String sent = "";
        int length = array.length;

        for (int i = 0; i < length; i++){
            sent = sent + array[i];
            if (i == length-1){
                sent = sent + ". ";
            } else {
                sent = sent + " ";
            }
        }

        return sent;
    }


}