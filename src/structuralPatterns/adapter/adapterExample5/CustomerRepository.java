package structuralPatterns.adapter.adapterExample5;

public class CustomerRepository {

    private CacheService cacheService;

    public CustomerRepository(CacheService cacheService){
        this.cacheService=cacheService;
    }

    public void save(){
        cacheService.store("cache'leme yapılıyor.");
        cacheService.remove("cahe silindi.");
    }
}
