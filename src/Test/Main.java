package Test;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Binh", 8);
        Person person2 = person1;
        person2.setAge(21);
        System.out.println(person1.toString());
    }
}
