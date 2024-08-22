package classes;

public class Person {
    public String name;
    public String surname;
    public int age;
    public double height;

    public Person(){}

    public String toString(){
        return "Name: " + this.name + "\nSurname: " + this.surname + "\nAge: " + this.age + "\nHeight: " + this.height;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
