package persone;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person();

//        person.id=1;
//        person.firstName = "Max";
//        person.lastName = "Smit";


        person.setId(1);
        person.setFirstName("Max");
        person.setLastName("Smit");


        System.out.println( "ID :" + person.getId());
        System.out.println( "FirstName :" + person.getFirstName());
        System.out.println( "LastName :" + person.getLastName());
    }
}