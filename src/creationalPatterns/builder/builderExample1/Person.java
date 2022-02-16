package creationalPatterns.builder.builderExample1;

public class Person {

    private String name;
    private String surname;
    private String address;

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{

        private String name;
        private String surname;
        private String address;

        public Builder(){}

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }

        public Builder address(String address){
            this.address=address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }



}
