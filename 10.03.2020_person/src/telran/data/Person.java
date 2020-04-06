package telran.data;

public class Person {

    private String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person " + name + '\n' +
                address;
    }

    public static void displayArrayPerson(Person[] persons){
        for (Person p:persons) {
            System.out.println(p.toString());
        }
    }

    public static void displayPersons(Person[] persons){
        for (int i = 0; i < persons.length; i++) {
            if(persons[i] != null) {
                System.out.println(persons[i]);

            }
        }
    }

    public static void findCityByName(Person[] persons, String name){
        int flag = 0;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getName().equalsIgnoreCase(name)){
                System.out.println(name + " lives in " + persons[i].getAddress().getCity());
                flag = 1;
            }
        }
        if(flag==0) {
            System.out.println("This person is not found");
        }
    }

    public static void findNameByCity(Person[] persons, String city){
        int flag = 0;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getAddress().getCity().equalsIgnoreCase(city)){
                System.out.println("In the city " + city + " lives " + persons[i].getName());
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println("This person is not found");
        }
    }

    public static Person[] listCityMembers(Person[] persons, String city, int size){
        int i = 0;
        Person[] cityMembers = new Person[size];
        boolean flag = false;
        for (Person p:persons) {
            if(p.getAddress().getCity().equalsIgnoreCase(city)){
                cityMembers[i]=p;
                i++;
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Not found anyone in this town");
        }
        return cityMembers;
    }

}
