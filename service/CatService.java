package testfinal.service;

import testfinal.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatService implements CatInterface {

    private List<Cat> listCat = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    @Override
    public boolean addCat(Cat cat) {
        for (Cat items : listCat) {
            if (items.getId() == cat.getId()) {
                System.out.println("Id already exists");
                return false;
            }
        }
        listCat.add(cat);
        return true;
    }

    @Override
    public boolean deleteCat(int id) {
        for (Cat items : listCat) {
            if (items.getId() == id) {
                listCat.remove(items);
                return true;
            }
        }
        return false;
    }

    @Override
    public void getAllCat() {
        listCat.stream().forEach(x -> {
            x.showInfo(x);
            System.out.println();
        });
    }

    @Override
    public boolean searchCat(int id) {
        for (Cat items : listCat) {
            if (items.getId() == id) {
                items.showInfo(items);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateSonorous(int id) {
        for (Cat cat : listCat) {
            if (cat.getId() == id) {
                System.out.print("Enter the sound that needs to be changed: ");
                String sonorous = sc.nextLine();
                cat.setSonorous(sonorous);
                return true;
            }
        }
        return false;
    }

    public Cat checkCat(Integer catStyle) {
        Cat cat = new BritishLonghairCat();
        if (catStyle == 1) {
            var c1 = new BritishLonghairCat();
            c1.setSonorous("I'm a British longhair cat");
            return c1;
        } else if (catStyle == 2) {
            var c2 = new BrittishShorthair();
            c2.setSonorous("I'm a British shorthair cat");
            return c2;
        } else if (catStyle == 3) {
            var c3 = new PersianCat();
            c3.setSonorous("I'm a Persian cat");
            return c3;
        } else if (catStyle == 4) {
            var c4 = new RussianCat();
            c4.setSonorous("I'm a Russian cat");
            return c4;
        }
        return cat;
    }

    public void catStyle() {
        System.out.println("1. British Longhair Cat");
        System.out.println("2. Brittish Shorthair");
        System.out.println("3. Persian Cat");
        System.out.println("4. Russian Cat");
    }

    public void add() {
        Cat cat = null;
        System.out.print("Enter the number of cats you want to add: ");
        int quantity = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantity; i++) {
            catStyle();
            System.out.print("Choose cat style: ");
            Integer catStyle = Integer.parseInt(sc.nextLine());
            cat = checkCat(catStyle);
            System.out.println("Cat information " + (i + 1));
            System.out.print("Enter id: ");
            Integer id = Integer.parseInt(sc.nextLine());
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            Integer age = Integer.parseInt(sc.nextLine());
            System.out.print("Enter gender: ");
            Boolean gender = Boolean.parseBoolean(sc.nextLine());
            cat.setId(id);
            cat.setName(name);
            cat.setGender(gender);
            cat.setAge(age);
            if (addCat(cat)) {
                System.out.println("Add success");
            } else {
                System.out.println("Add fail");
            }
        }
    }

    public void delete() {
        System.out.print("Enter the cat id to delete: ");
        Integer id = Integer.parseInt(sc.nextLine());
        if (deleteCat(id)) {
            System.out.println("Delete success");
        } else {
            System.out.println("Delete fail");
        }
    }

    public void all() {
        System.out.println("Complete list of cats");
        getAllCat();
    }

    public void display() {
        System.out.print("Enter the cat id to display: ");
        int id = Integer.parseInt(sc.nextLine());
        if (searchCat(id)) {
            System.out.println("Cat here");
        } else {
            System.out.println("Couldn't find any cat id like that");
        }
    }

    public void update() {
        System.out.print("Enter the cat id whose sound needs to be changed: ");
        Integer id = Integer.parseInt(sc.nextLine());
        if (updateSonorous(id)) {
            System.out.println("Successfully changed the cat's meow sound");
        } else {
            System.out.println("Changing the cat's meow sound failed");
        }
    }
}
