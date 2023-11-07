package ui;

import model.Nutricion;
import model.Nutrientes;

import java.util.ArrayList;
import java.util.Scanner;

public class UIFoodMenu {

    public static ArrayList<Nutricion> nutricionsRegistrationDay = new ArrayList<>();
    public static void showFoodMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("User");
            System.out.println("Welcome " + UIMenu.learntoEatLogged.getNombre());
            System.out.println("1. Add your food today");
            System.out.println("2. Sign in");
            System.out.println("0. Loggout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    showaddnewdayfoodMenu();
                    break;
                case 2:
                    break;
                case 0:
                UIMenu.showMenu();
            }

        }while (response != 0);
    }
    private static void showaddnewdayfoodMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add your food today");
            System.out.println(":: Select a meal");

            for (int i = 0; i < 3; i++) {
                // me va a ayudar a mostrar la numeracion de los meses, variable auxiliar y temporal
                int j = i + 1;
                System.out.println(j + UIMenu.MEAL[i]);
            }
            System.out.println("0. Return");

            //nuevamente vamos a recibir la respuesta
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response>0 && response < 4){
                int mealSelected = response;
                //-1 porque las respuestas siempre van desde 1 hasta infinito y en este caso queremos los indices n-1
                System.out.println(mealSelected +" . "+ UIMenu.MEAL[mealSelected-1]);
                System.out.println("add food+");
                String food = sc.nextLine();
                System.out.println("look for food" + food + "\nBack \nCheck");
                int responsefood = Integer.valueOf(sc.nextLine());
                if (responsefood == 2) continue;

                int responseMealtime = 0;
                String time = "";
                do {
                    System.out.println("add your meal today" + food + " [Breakfast, Lunch, Dinner]");
                    food = sc.nextLine();
                    System.out.println("look for food" + food + "\nBack \nCheck");
                    responseMealtime = Integer.valueOf(sc.nextLine());
                }while (responsefood == 2);
            } else if (response == 0) {
                showFoodMenu();
            }
        } while (response != 0);
    }

    private static void checkNutricionRegistrationDay(Nutricion nutricion){
        //aqui se hace una validación
        if (nutricion.getRegistrationDay().size() > 0
        && !nutricionsRegistrationDay.contains(nutricion)){
            nutricionsRegistrationDay.add(nutricion);
        }
    }
}
