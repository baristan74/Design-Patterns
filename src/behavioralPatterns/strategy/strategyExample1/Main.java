package behavioralPatterns.strategy.strategyExample1;

public class Main {
    public static void main(String[] args) {

        //Context sınıfı istemciyi işlemlerin gerçekleştirilmesinden soyutlar
        Context context= new Context(new YılbasiArayüzü());

        context.arayüzGetir();
        int arayüzindirim=context.arayüzİndirimi(1000);

        System.out.println("Seçilen arayüzün indirim değeri:"+ arayüzindirim);
    }
}