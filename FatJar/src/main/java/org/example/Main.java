package org.example;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Volodymyr", "Semenov");

        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}
class User{
    String name;
    String surname;

    public User (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}