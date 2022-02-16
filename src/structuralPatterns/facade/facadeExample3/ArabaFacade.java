package structuralPatterns.facade.facadeExample3;

public class ArabaFacade {
    private Model model;
    private Motor motor;
    private Govde govde;

    public void ArabaOlustur(){
        model.modelOlustur();
        motor.MotorOlustur();
        govde.govdeOlustur();

        // Araba oluştu
    }
}
