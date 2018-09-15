
/**
 *
 * @author MikaelBergstrom
 */

public class Note {
    //Deklarerar variabler
    private String heading;
    private String text;
    private String signed;
    private int numberOfChars;
    private int numberOfWords;
    private int priceClass;


    public Note(String rubrik, String notistext, String underskrift) {
        //Konstruktor for rubrik, notistext och underskrift
        heading = rubrik;
        text = notistext;
        signed = underskrift;
        numberOfWords = text.split(" ").length;
        numberOfChars = text.length();
        numberOfChars += (heading.length() + signed.length());


    }
    //Metod for att returnera notisens rubrik
    public String getHeading()
    {
        return heading;
    }
    //Metod for att returnera notisens text
    public String getText()
    {
        return text;
    }
    //Metod for att returnera notisens forfattare
    public String getSigned()
    {
        return signed;
    }
    //Metod for att returnera antalet ord
    public int getNumberOfWords()
    {
        return numberOfWords;
    }
    //Metod for att returnera antalet karaktarer
    public int getNumberOfChars()
    {
        return numberOfChars;
    }
    //Metod for att returnera vilken prisklass texten hamnar i
    public int getPriceClass()
    {
        if(numberOfChars >= 500)
        {
            priceClass = 3;
        }
        else if(numberOfChars <500 && numberOfChars >= 250)
        {
            priceClass = 2;
        }
        else if(numberOfChars < 250)
        {
            priceClass = 1;
        }
        return priceClass;
    }

}


