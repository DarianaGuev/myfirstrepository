package model;

public class User {
    int id;
    String nombre;
    String country;
    public String email;
    String password;
    User(){
        System.out.println("Este es un usuario nuevo");
    }
    public User(String email, String nombre){
        this.nombre = nombre;
        this.email = email;
        System.out.println("El correo del nuevo usuario de LearnToEat es: " + email + "Nombre: " + nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showEmail(){
        System.out.println(email);
    }

    @Override
    public String toString() {
        return "Country: " + country + "Email: " + email;
    }
}
