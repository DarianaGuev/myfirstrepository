package ui;

import model.*;
import model.Enum;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        showMenu();
        /*
        User imUser = new User("santosde@aol.com", "Gutierrez Solis");
        imUser.email = "rosalia45@gmail.com";
        imUser.showEmail();

        Nutricion nutricion1 = new Macros(2000,600, 3000);
        nutricion1.showDataNutrition();

        //Clases anonimas
        Nutricion nutricion2 = new Nutricion(2500, 25, 100) {
            @Override
            public void showDataNutrition() {
                System.out.println("CALORIAS");
                System.out.println("TOTAL: 2,500 GRAMOS");
                System.out.println("OBJETIVO : 1,845");
            }
        };

        Itodayable itodayable = new Itodayable() {
            @Override
            public void today(Date date, String record) {
                System.out.println("Esta es mi interface en la que pondre cosas abstractas:)");
            }
        };

        Nutrientes day1 = new Nutrientes(140, 100, 200);
        System.out.println(day1);


        System.out.println(Enum.Day.Friday);

         */
    }
}