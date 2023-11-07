package ui;

import model.Nutricion;
import model.Nutrientes;
import model.User;

import java.util.*;

import static ui.UIMenu.*;

public class UINutrientesMenu {
    public static void showNutrientesMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Nutricion");
            System.out.println("Welcome: " + nutriLogged.getNombre());
            System.out.println("1. Add food");
            System.out.println("2. My meal");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddFoodMenu();
                    break;
                case 2:
                    showMyNutrition();
                    break;
                case 0:
                    showMenu();
                    break;
            }

        }while (response!=0);
    }
    private static void showAddFoodMenu(){
        int response = 0;
        do {
            System.out.println("::Add food");
            System.out.println(":: Select a meal");
            //primer integer va a llevar la numeracion de lista de comida
            //indice fecha seleccionada
            //[food]
            //1.-food 1
                // - 1 meal1
                // - 2 meal2
            //2.-food2
            Map<Integer, Map<Integer, Nutricion>> nutri = new TreeMap<>();
            int k = 0;
            //.SIZE para que se recorra segun el tamaño que tenga
            for (int i = 0; i < UIFoodMenu.nutricionsRegistrationDay.size(); i++) {
                Collection<Object> registrationDayss = UIFoodMenu.nutricionsRegistrationDay.get(i).getRegistrationDay();

                Map<Integer, Nutricion> nutricions = new TreeMap<>();

                for (int j = 0; j < registrationDayss.size(); j++) {
                    k++;
                    System.out.println(k + ". " + registrationDayss.get(j).getDate());
                    registrationDayss.put(Integer.valueOf(j), UIFoodMenu.nutricionsRegistrationDay.get(i));
                    //we are doing a new data structures this can help us control output
                    nutricions.put(Integer.valueOf(k), registrationDayss);
                }
            }
            Scanner sc = new Scanner(System.in);
            //when i have the food selected i can know what food show
            int responseFoodSelected =Integer.valueOf(sc.nextLine());
            Map<Integer, Nutricion> nutricionRegistrationSelected = nutri.get(responseFoodSelected);
            //indice de la fecha
            Integer indexDate = 0;
            Nutricion nutricionSelected = new Nutricion(250, 1845, 2345) {
                @Override
                public void showDataNutrition() {
                    
                }
            };
            for (Map.Entry<Integer, Nutricion> nut :nutricionRegistrationSelected.entrySet()) {
                indexDate = nut.getKey();
                nutricionSelected = nut.getValue();
            }
            System.out.println(nutricionSelected.getNombre() +
                    ". Date: " +
                    nutricionSelected.getRegistrationDays().get(indexDate).getDate() +
                    ". Time: " +
                    nutricionSelected.getRegistrationDays().get(indexDate).getTime());
            System.out.println("Comfirm the date of your food record: \n1. Yes \n2. Changes data ");
            response = Integer.valueOf(sc.nextLine());
            //start now we can put logic programming
            if (response == 1){
                nutriLogged.addRegistrationDays(
                        nutricionSelected,
                        nutricionSelected.getRegistrationDays().get(indexDate).getDate(null),
                        nutricionSelected.getRegistrationDays().get(indexDate).getTime());
                showNutrientesMenu();

            }
        }while (response!=0);
    }

    private static void showMyNutrition(){
        int response = 0;
        do {
            //something for check my nutrition information
            System.out.println("::My nutrition");
            if (nutriLogged.getRegistrationDays().size()==0){
                System.out.println("Don´t have register food");
                break;
            }
            //para que lo recorra tantas veces tenga comida registrada
            for (int i = 0; i < nutriLogged.getRegistrationDays().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.nutriLogged.getRegistrationDays().get(i).getDate()+
                        " Record: " + nutriLogged.getRegistrationDays().get(i).getRecord()+
                        "\n Usuario: " + nutriLogged.getRegistrationDays().get(i).getUser().getName());
                
            }
            System.out.println("0.Return");

        }while (response !=0);
    }
}
