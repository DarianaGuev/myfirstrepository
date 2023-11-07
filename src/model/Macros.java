package model;

import java.util.Arrays;
import java.util.Date;

public class Macros extends Nutricion implements Itodayable {
    int carbohydrates;
    int fats;
    int protein;

    public Macros(int Calorias, int Nutrientes, int Macros){
        super(Calorias, Nutrientes, Macros);
    }

    @Override
    public  void showDataNutrition() {
        for (String s : Arrays.asList("¿Que te gustaria comer?", "¿Cuantos vasos de agua tomaste hoy?", "¿Ya hiciste deporte?")) {
            System.out.println(s);
        }
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    @Override
    public void today(Date date, String record) {

    }
}
