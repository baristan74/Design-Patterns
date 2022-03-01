package structuralPatterns.flyweight.flyweightExample2;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {

    private static final Map<String, Piece> pieceMap = new HashMap();

    public static Piece getPiece(String pieceType) {
        Piece piece = null;

        if (pieceMap.get(pieceType) != null) {
            piece = pieceMap.get(pieceType);
        } else {
            if (pieceType.equalsIgnoreCase("I")) {
                piece = new I();
            } else if (pieceType.equalsIgnoreCase("T")) {
                piece = new T();
            } else if (pieceType.equalsIgnoreCase("J")) {
                piece = new J();
            }

            pieceMap.put(pieceType, piece);
        }

        return piece;
    }
}

// 8 numaralı satırda, bir hashmap tanımlanıyor. Bu hashmap, String kısmında tip bilgisini alıyor.
// Örneğin; I veya T gibi, diğer kısımda ise ilgili Piece nesnesini tutmaktadır.
// Eğer ilgili nesne daha önce oluşturmuş ise bu nesne geri döndürülür. Eğer daha önce nesne oluşturulmamış ise bu durumda new anahtar kelimesi ile oluşturulur.
// Her iki durumda da nesnenin extensic state olarak adlandırdığımız alanları oluşturulmak istenen yeni nesnenin özelliklerine göre doldurulur.
