package NLPlibraries;

import org.antlr.v4.runtime.Token;
import zemberek.tokenization.TurkishTokenizer;
import zemberek.tokenization.antlr.TurkishLexer;

import java.io.IOException;
import java.util.List;

public class trTokenizer
{
    public enum Type
    {
        Email,
        HashTag,
        Mention,
        MetaTag,
        URL,
    }

    public static void main(String[] args)  throws IOException
    {
        TurkishTokenizer tokenizer = TurkishTokenizer.DEFAULT;
        List<org.antlr.v4.runtime.Token> tokens = tokenizer.tokenize("google.com");
        for (Token token : tokens) {
            System.out.println("Content = " + token.getText());
            System.out.println("Type = " + TurkishLexer.VOCABULARY.getDisplayName(token.getType()));
            System.out.println("Start = " + token.getStartIndex());
            System.out.println("Stop  = " + token.getStopIndex());
            System.out.println();
        }
    }
}
