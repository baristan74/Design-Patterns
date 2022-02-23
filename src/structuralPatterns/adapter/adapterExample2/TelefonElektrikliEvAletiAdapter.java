package structuralPatterns.adapter.adapterExample2;

public class TelefonElektrikliEvAletiAdapter implements ElektrikliEvAletleri {

    Telefon telefon;

    public TelefonElektrikliEvAletiAdapter(Telefon telefon){

        this.telefon=telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}
