package classes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ControllerRegister {

    public static Person register(){
        Scanner reader = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            try {
                Person person = new Person();

                System.out.println("Type your name:");
                person.setName(reader.next());

                System.out.println("Type your surname:");
                person.setSurname(reader.next());

                System.out.println("Type your age:");
                person.setAge(reader.nextInt());

                System.out.println("Type you height:");
                person.setHeight(reader.nextDouble());

                reader.close();
                return person;


            } catch (InputMismatchException e) {
                System.out.println("Age and height require numeric inputs. Please try again.");

                reader.nextLine();
            }
        }

    }

}
