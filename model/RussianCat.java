package testfinal.model;

public class RussianCat extends Cat {
    @Override
    void sonorous() {
        System.out.println("Sonorous: "+this.getSonorous());
    }
}
