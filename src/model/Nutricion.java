package model;

import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public abstract class Nutricion extends User{
    private static model.Calorias Calorias;
    private static model.Nutrientes Nutrientes;
    private static int Macros;
    private static int today;

    private ArrayList<RegistrationDay> registrationDays = new ArrayList<>();

    public Nutricion(int caloria, int nutri, int macros) {
    }

    public Nutricion() {

    }

    public static model.Calorias getCalorias() {
        return Calorias;
    }

    public static void setCalorias(model.Calorias calorias) {
        Calorias = calorias;
    }

    public static model.Nutrientes getNutrientes() {
        return Nutrientes;
    }

    public static void setNutrientes(model.Nutrientes nutrientes) {
        Nutrientes = nutrientes;
    }

    public static int getMacros() {
        return Macros;
    }

    public static void setMacros(int macros) {
        Macros = macros;
    }

    public static int getToday() {
        return today;
    }

    public static void setToday(int today) {
        Nutricion.today = today;
    }

    public ArrayList<RegistrationDay> getRegistrationDays() {
        return registrationDays;
    }

    public void addRegistrationDays(Calorias calorias, Date date, String time) {
        Calorias caloriass = new Calorias(this, calorias);
        calorias.today(date, time);
        calorias.add(registrationDays);
    }

    public Nutricion(Calorias Calorias, Nutrientes Nutrientes, int Macros) {
        this.Calorias = Calorias;
        this.Nutrientes = Nutrientes;
        this.Macros = Macros;
    }

    public abstract void showDataNutrition();

    public Collection<Object> getRegistrationDay() {
        return null;
    }

    public void addRegistrationDays(Nutricion nutricionSelected, Collection<Object> registrationDay) {
    }


    public static class RegistrationDay {
        private int id;
        private Date date;
        private String time;
        static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //Metodo que añadira nuevas citas
        ArrayList<RegistrationDay> registrationDay = new ArrayList<>();

        public RegistrationDay(Date date, String time) {

        }

        public RegistrationDay(Nutricion nutricion, Calorias calorias) {

        }

        public RegistrationDay(RegistrationDay registrationDay) {

        }

        public void addRegistrationDay(String date, String time){
            registrationDay.add(new Nutricion.RegistrationDay(date, time));
        }

        public RegistrationDay(String date, String time) {
            try {
                this.date = format.parse(String.valueOf(date));
            }catch (ParseException e){
                e.printStackTrace();
            }
            this.time = time;
        }

        public void addRegistrationDay(Date date, String time) {
            registrationDay.add(new RegistrationDay(date, time));
        }

        //Devolver numero de citas disponibles
        public ArrayList<RegistrationDay> getRegistrationDay() {
            return registrationDay;
        }

        @Override
        public String toString() {
            return super.toString() + "\nNutrient percentage: " + Nutrientes + "\nRegistration day: " + registrationDay.toString();
        }

        public Path getUser() {
            return null;
        }


        public static class registrationDay {
            private int id;
            private String date;
            private String time;
            private int today;


            public registrationDay(String date, String time) {
                this.date = date;
                this.time = time;
            }

            public String getDate(String DATE) {
                return date;
            }

            public String getDate(){
                return format.format(date);
            }

            public void setDate(Date date) {
                this.date = String.valueOf(date);
            }

            public String getTime() {
                return time + "hrs.";
            }

            public void setTime(String time) {
                this.time = time;
            }

            public model.Calorias getCalorias() {
                return Calorias;
            }

            public void setCalorias(model.Calorias calorias) {
                Calorias = calorias;
            }

            public model.Nutrientes getNutrientes() {
                return Nutrientes;
            }

            public void setNutrientes(model.Nutrientes nutrientes) {
                Nutrientes = nutrientes;
            }

            public int getMacros() {
                return Macros;
            }

            public void setMacros(int macros) {
                Macros = macros;
            }

            public int getToday() {
                return today;
            }

            public void setToday(int today) {
                this.today = today;
            }

            @Override
            public String toString() {
                return "Registration day \nDay: "+date;
            }
            public void user(Date date, String time){
                this.date = String.valueOf(date);
                this.time = time;
            }
        }
    }
}
