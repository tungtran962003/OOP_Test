package testfinal.model;

public class BritishLonghairCat extends Cat {
    @Override
    void sonorous() {
        System.out.println("Sonorous: "+this.getSonorous());
    }
}
