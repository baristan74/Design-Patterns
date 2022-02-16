package creationalPatterns.builder.builderExample2;

public class Client {
    public static void main(String[] args) {
        Araba araba = new Araba.Builder().klima(true).ekran(true).yas(2010).abs(true).build();
    }
}
