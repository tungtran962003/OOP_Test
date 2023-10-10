package testfinal.view;

import testfinal.service.CatService;

import java.util.Scanner;

public class View {

    private CatService meoService;

    private Scanner sc;

    public View() {
        meoService = new CatService();
        sc = new Scanner(System.in);
        menu();
    }

    public void menu() {
        System.out.println("--------------------Cat management for mom----------------------------");
        System.out.println("1.Add cat");
        System.out.println("2.Delete cat by id");
        System.out.println("3.Show all cats");
        System.out.println("4.Show cats by id");
        System.out.println("5.Change cat meow by id");
        System.out.println("6.Exit programs");
        System.out.print("Select 1 option: ");
        int option = Integer.parseInt(sc.nextLine());
        controller(option);
    }

    public void controller(int option) {
        switch (option) {
            case 1:
                meoService.add();
                break;
            case 2:
                meoService.delete();
                break;
            case 3:
                meoService.all();
                break;
            case 4:
                meoService.display();
                break;
            case 5:
                meoService.update();
                break;
            case 6:
                System.exit(0);
                break;
        }
        menu();
    }
}
