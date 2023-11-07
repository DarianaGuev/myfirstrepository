package ui;

import model.Nutricion;
import model.Nutrientes;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] DAYS = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
    public static final String[] MEAL = {"Breakfast", "Collation", "Lunch", "Dinner"};
    public static User learntoEatLogged;
    public static Nutrientes nutriLogged;
    public static void showMenu() {
        System.out.println("Welcome to learn to eat");
        System.out.println("Seleccione la opcion deseada");
        int response = 0;
        do {
            System.out.println("1. Macros");
            System.out.println("2. Calorias");
            System.out.println("0. Salir");

            //La opcion scanner es para saber lo que el usuario dice en el teclado o para leer lo que dice el teclado
            //System.in = representa la entrada o respuesta que el user de en una variable que se llame response
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Usuario");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please, select a correct answer");
            }
        }while (response !=0);
    }


    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Usuario");
            System.out.println("1. Registro de alimentos");
            System.out.println("2. Numero de calorias");
            System.out.println("0. Return");

            //La opcion scanner es para saber lo que el usuario dice en el teclado o para leer lo que dice el teclado
            //System.in = representa la entrada o respuesta que el user de en una variable que se llame response
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i <4; i++) {
                        System.out.println(i +". " + DAYS[i]);

                    }
                    break;
                case 2:
                    System.out.println("::My appointment");


                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + response);
            }
        }while (response !=0);
    }
    private static void authUser(int userType){
        //es una simulacion de cuantos usuarios hay
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("luisalonzo@gmail.com", "Jarim de los Santos"));
        users.add(new User("railin@gmail.com", "Arlin Moreno Guevara"));
        users.add(new User("gondata@gmail.com", "Darisa Ramirez mon"));

        ArrayList<Nutrientes> nutrientess = new ArrayList<>();
        nutrientess.add(new Nutrientes(200,250,70));
        nutrientess.add(new Nutrientes(250,300,28));
        nutrientess.add(new Nutrientes(150,200,100));

        boolean emailcorrect = false;
        do {
            System.out.println("Insert your email: [a@gmail.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (User d: users){
                    if (d.getEmail().equals(email)){
                        emailcorrect = true;
                        //ahora lo que haremos es poner el usuario logeado
                        learntoEatLogged = d;
                        // next step is show user menu
                    }
                }
            }
            if (userType == 2){
                for (Nutrientes n: nutrientess){
                    if (n.getEmail().equals(email)){
                        emailcorrect = true;
                        nutriLogged = n;
                        UIFoodMenu.showFoodMenu();
                    }
                }

            }

        }while (!emailcorrect);
    }

    static void showMacrosMenu(){}
}

