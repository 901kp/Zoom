package horoscope;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import java.awt.Container;
import java.awt.Color;
import java.awt.BorderLayout;

/*A program to create a horoscope based on one's star sign. It enquires
for it from the user in the terminal, and then prints a completed
horoscope in a separate window.*/

public class horoscope {
    
    /*Creates a window to display the completed horoscope*/
    public static void window(String title, String sent1, String sent2, String sent3) throws BadLocationException {

        JFrame frame = new JFrame("Horoscope");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();
        JTextPane pane = new JTextPane();
        pane.setEditable(false);

        Color myCol = new Color(246, 224, 224);
        pane.setBackground(myCol);

        SimpleAttributeSet attrSet = new SimpleAttributeSet();
        StyleConstants.setBold(attrSet, true);
        StyleConstants.setAlignment(attrSet, StyleConstants.ALIGN_CENTER);
        StyleConstants.setFontSize(attrSet,20);
        Document doc = pane.getStyledDocument();

        // attributes
        pane.setCharacterAttributes(attrSet, true);
        pane.setText("\n" + title + "\n\n");

        attrSet = new SimpleAttributeSet();
        StyleConstants.setFontSize(attrSet,15);

        doc.insertString(doc.getLength(), sent1, attrSet);
        doc.insertString(doc.getLength(), sent2 + sent3, attrSet);

        JScrollPane scrollPane = new JScrollPane(pane);
        cp.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(330, 340);
        frame.setVisible(true);

    }

    public static void main(String[] args) throws BadLocationException {

        /*Creates object of the sign class to acquire the star sign and of a
        fullHoroscope class to have the access to the building horoscope functions.*/
        sign sign = new sign();
        fullHoroshope hor = new fullHoroshope();
        String starSign = sign.getSign();

        /*Sets texts.*/
        String title = "The horoscope for " + starSign + " for " + java.time.LocalDate.now() + ".";
        String sent1 = hor.makeSentence(hor.firstSentence());
        String sent2 = hor.makeSentence(hor.secondSentence());
        String sent3 = hor.makeSentence(hor.thirdSentence(starSign));
        
        /*Opens the separate windoww to display the full horoscope.*/
        window(title, sent1, sent2, sent3);

    }
}