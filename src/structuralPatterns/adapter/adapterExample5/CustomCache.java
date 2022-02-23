package structuralPatterns.adapter.adapterExample5;

public class CustomCache implements CacheService{
    @Override
    public void remove(String key) {
        System.out.println("Custom cache ile " + key);
    }

    @Override
    public void store(String data) {
        System.out.println("Custom cache ile "+ data);
    }
}
