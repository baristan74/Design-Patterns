package structuralPatterns.adapter.adapterExample1;

public class Main {
    public static void main(String[] args) {

        Yedekleyici adapter=new UzakHedefAdapter();
        adapter.kaydet("dosya","domain");
    }
}
