package NLPlibraries;

import org.antlr.v4.runtime.Token;
import zemberek.tokenization.TurkishTokenizer;

import java.io.IOException;
import java.util.List;

public class trTokenizer
{
    public static void main(String[] args)  throws IOException
    {
        TurkishTokenizer tokenizer = TurkishTokenizer.DEFAULT;
        List<org.antlr.v4.runtime.Token> tokens = tokenizer.tokenize("Atatürk nerde doğdu?");
        for (Token token : tokens) {
            System.out.println("Content = "  + token.getText());
            System.out.println("Start = "  + token.getStartIndex());
            System.out.println("Stop = " + token.getStopIndex());
            System.out.println("Type = " + token.getType());
            System.out.println();
        }
    }
}
