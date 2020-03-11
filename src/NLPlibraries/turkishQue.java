package NLPlibraries;

/*
import java.io.IOException;
import java.util.List;

public class turkishQue
{
    public static void main(String[] args) throws IOException
    {
        String[][][] arrTrQue = new String[3][3][4];			//Soru kalıplarının oluşturulması ve hafızada tutulması
        {
            {
                "y\u00fczde ka\u00e7", "oran", "kaç"},
            {"yıl nedir", "yıl", "nedir?"},
            {"yıl kaçtır", "yıl", "kaçtır?"},
            {"yapıtaşları nelerdir", "bileşen", "nelerdir"},
// 			{"", "", ""},
        };

        for(int i = 0; i < 3; i++)			//Soru kalıplarının hafızada istenilen şekilde tutulduğunun kontrolü
        {
            for(int j = 0; j < 3; j++)
            {
                for(int k = 0; k < 4; k++)
                {
                    System.out.print(" " + arrTrQue[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        TurkishTokenizer tokenizer = TurkishTokenizer.DEFAULT;
        List<Token> tokens = tokenizer.tokenize("Saat 12:00");
        for (Token token : tokens) {
            System.out.println("Content = "  + token.getText());
            System.out.println("Start = "  + token.getStartIndex());
            System.out.println("Stop = " + token.getStopIndex());
            for(int i = 0; i < 3; i++)		//Dizinin ilk satırlarını kontrol ediyor. Dizinin ilk kolonu. 00 10 20... i++ & j = 0
            {
                if(token.getText() == arrTrQue[i][0]) //Dizinin ilk kolonu tokenization işleminin parçalanmış kelimelerinin kontol çabası.
                {
                    j = i;
                    System.out.println("Question Type = " + arrTrQue[i][j]); //Yazması gereken Soru türü yani 2. sütun.
                }
                else
                {
                    System.out.println("Soru Kalıbı Bulunamadı.");
                }

            }
            System.out.println("Type = " + token.getType());
            System.out.println();
        }



		*/
/* for(int i = 0; i < 3, i++)
		{
			for(int j = 0; j < 3, j++)
			{
				for(int k = 0; k < 4; k++)
				{
					if(arrTrQue[i] == zemberek.tokenizer.Token 															token :token)
					{}

				}
				System.out.println();
			}
				System.out.println();
		} *//*

    }
}
*/
