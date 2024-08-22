package main;

import classes.Person;
import static classes.ControllerRegister.register;

public class Main {
    public static void main(String[] args) {
        Person person = register();
        System.out.println(person);
    }
}