package telran.personApp;

import telran.data.Address;
import telran.data.Person;
import static telran.data.Person.*;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Jevgenijs", new Address());
        p1.setAddress(new Address("Riga", "Prospekt Lenina", 100));
        Person p2 = new Person("Arion", new Address("Berlin", "Friedrichsstraße", 67));
        Address address1 = new Address("Palma de Mallorca", "Barcelona Boulevard", 23);
        Person p3 = new Person("Sergey", address1);
        Person p4 = new Person("Alina", new Address("Paris", "Saint-Denis", 7));
        Person p5 = new Person("Luba", new Address("London", "Baker Street", 221));

        Person[] persons = new Person[] {p1, p2, p3, p4, p5};
        displayArrayPerson(persons);

        System.out.println();
        System.out.println(p1.toString());
        p1.getAddress().setCity("Sigulda");
        System.out.println(p1.toString());
        System.out.println(p1.getAddress().getCity());
        System.out.println(p1.getName() + " lives on the " + p1.getAddress().getStreet());

        System.out.println();
        findCityByName(persons, "Arion");
        findCityByName(persons, "Kolya");
        System.out.println();
        findNameByCity(persons, "Paris");
        findNameByCity(persons, "Barcelona");

        System.out.println();
        Person[] cityMembers = Person.listCityMembers(persons, "Berlin", 3);
        Person.displayPersons(cityMembers);

        System.out.println();
        Person[] cityMembers2 = Person.listCityMembers(persons, "Barcelona", 3);
        Person.displayPersons(cityMembers2);

    }

}
