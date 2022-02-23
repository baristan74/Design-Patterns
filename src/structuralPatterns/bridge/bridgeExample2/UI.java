package structuralPatterns.bridge.bridgeExample2;

public abstract class UI {

    Mod mod;

    public UI(Mod mod){
        this.mod=mod;
    }

    public abstract void oluştur();

}
