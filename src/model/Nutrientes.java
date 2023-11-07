package model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Nutrientes implements Itodayable{
    int Protein;
    int Carbs;
    int fats;
    int fiber;
    int sugar;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public int getProtein() {
        return Protein;
    }

    public int getCarbs() {
        return Carbs;
    }

    public void setCarbs(int carbs) {
        Carbs = carbs;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public Nutrientes(int Protein, int Carbs, int fats){
        this.Protein = Protein;
        this.Carbs = Carbs;
        this.fats = fats;
        this.email = email;
    }
    public void setProtein(int target){
        int totalPro = 0;
        target = totalPro - 0;

        for (int i = 0; i < totalPro + 1; i++) {
            for (int j = 0; j < target; j++) {
            }
        }
        if(totalPro == target) {
        } else {
            if (totalPro < target) {
                System.out.println("No cumpliste con los gramos de proteina");
            }
            if (totalPro > target)
                System.out.println("Te excediste, te vas a poner gordo:(");
        }

    }
    public static int carbs(int maiz){
        int totalCar = 290;
        if (totalCar < 0) return 0;

        return totalCar;
    }

    public static int fat(int oil){
        int totalFat = 80;
        if (totalFat <0 ) return 0;

        return totalFat;
    }

    public void showEmail(){
        System.out.println(email);
    }

    @Override
    public String toString() {
        return "Gramos de proteina: " + Protein + "Gramos de carbs: " + Carbs + "Email: "+email;
    }

    @Override
    public void today(Date date, String record) {

    }

}
