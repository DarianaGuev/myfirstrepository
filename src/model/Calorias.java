package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Calorias extends Nutricion implements Itodayable{
    private static final model.Nutrientes Nutricion = null;
    public int breakfast;
    public int lunch;
    public int dinner;
    private Date date;
    private String record;

    public Calorias(model.Calorias Calorias, Nutricion nutricion, int Macros) {
        super(Calorias, Nutricion, Macros);
    }

    public Calorias(model.Nutricion nutricion, model.Calorias calorias) {
        super();
    }


    @Override
    public void showDataNutrition() {
        System.out.println("¿Cuantas calorias son ideales?");
        System.out.println("Te pasaste de calorias, pero te puedes recuperar mañana!");
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public int getDinner() {
        return dinner;
    }

    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    public int getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(int appetizer) {
        this.appetizer = appetizer;
    }

    int appetizer;


    @Override
    public void today(Date date, String record) {
        this.date = date;
        this.record = record;
    }

    public void add(ArrayList<RegistrationDay> registrationDays) {
    }
}

