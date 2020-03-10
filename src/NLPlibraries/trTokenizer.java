package NLPlibraries;
import zemberek.morphology.analysis.WordAnalysis;
import zemberek.morphology.analysis.tr.TurkishMorphology;
import java.io.IOException;
import java.util.List;
import jdk.nashorn.internal.parser.Token;
import zemberek.tokenization.TurkishTokenizer;
import zemberek.tokenization.antlr.TurkishLexer;
import zemberek.morphology.TurkishMorphology;
import zemberek.tokenization.antlr.TurkishLexer;

public class trTokenizer
{
    public static void main(String[] args)  throws IOException
    {
        TurkishTokenizer tokenizer = TurkishTokenizer.DEFAULT;
        List<zemberek.tokenization.Token> tokens = tokenizer.tokenize("Saat 12:00");
        for (zemberek.tokenization.Token token : tokens) {
            System.out.println("Content = "  + token.getText());
            System.out.println("Start = "  + token.getStartIndex());
            System.out.println("Stop = " + token.getStopIndex());
            System.out.println("Type = " + token.getType());
            System.out.println();
        }
    }
}
