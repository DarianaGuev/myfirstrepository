package model;

public class Enum {
    public enum Day{
        Monday("Lunes"),
        Tuesday("Jueves"),
        Friday("Viernes"),
        Saturday("Sabado"),
        Sunday("Domingo");

        private String spanish;
        private Day(String s){
            spanish = s;
        }
        private String getSpanish(){
            return spanish;
        }
    }
}
