import person.Person;

import person.PersonAgeComparator;
import person.PersonNameComparator;
import person.PersonSuperComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Alex",24);
        Person person5 = new Person("Alex",20);
        Person person6 = new Person("Alex",10);
        Person person2 = new Person("John",35);
        Person person3 = new Person("Felix",12);
        Person person7 = new Person("Felix",9);
        Person person4 = new Person("Jane",32);

        ArrayList <Person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);

        System.out.println(personList);

        /*Comparator<Person> personComparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        Collections.sort(personList, personComparator);*/

        PersonSuperComparator personSuperComparator = new PersonSuperComparator();
        Collections.sort(personList, personSuperComparator);



        System.out.println(personList);

    }
}
