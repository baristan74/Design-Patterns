package structuralPatterns.adapter.adapterExample5;

public class CacheDecoratorAdapter implements CacheService{

    CachingDecorator cachingDecorator;

    @Override
    public void remove(String key) {
        cachingDecorator.add(key);
    }

    @Override
    public void store(String data) {
        // third part cachleme
        cachingDecorator.add(data);
    }
}
