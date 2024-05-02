package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Иван", "Иванов", 30);
        System.out.println(person);

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println("Результат сериализации  " + json);

        String newPerson = "{\"firstName\":\"Вася\",\"lastName\":\"Пупкин\",\"age\":55}";
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gsonResult = gsonBuilder.create();
        Person personResult = gsonResult.fromJson(newPerson, Person.class);
        System.out.println("Результат десериализации " + personResult);
    }
}