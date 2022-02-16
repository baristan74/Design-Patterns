package creationalPatterns.builder.builderExample2;

public class Araba {
    private int yas;
    private boolean klima;
    private boolean ekran;
    private boolean abs;

    private Araba(Builder builder){
        yas = builder.yas;
        klima= builder.klima;
        ekran= builder.ekran;
        abs = builder.abs;
    }

    public static class Builder{
        private int yas;
        private boolean klima;
        private boolean ekran;
        private boolean abs;

        public Builder(){}

        public Builder yas(int yas){
            this.yas=yas;
            return this;
        }

        public Builder klima(boolean klima){
            this.klima=klima;
            return this;
        }

        public Builder ekran(boolean ekran){
            this.ekran= ekran;
            return this;
        }

        public Builder abs(boolean abs){
            this.abs=abs;
            return this;
        }

        public Araba build(){
            return new Araba(this);
        }
    }
}
