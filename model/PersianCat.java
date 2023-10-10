package testfinal.model;

public class PersianCat extends Cat {
    @Override
    void sonorous() {
        System.out.println("Sonorous: "+this.getSonorous());
    }
}
