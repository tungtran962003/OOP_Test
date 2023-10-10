package testfinal.service;

import testfinal.model.Cat;

public interface CatInterface {
    boolean addCat(Cat cat);

    boolean deleteCat(int id);

    void getAllCat();

    boolean searchCat(int id);

    boolean updateSonorous(int id);

}
