package creationalPatterns.builder.builderExample1;

public class Client {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("Baris").surname("Tan").address("Türkiye").build();
    }

}
