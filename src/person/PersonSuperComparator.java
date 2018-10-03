package person;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

            int flag = o1.getName().compareTo(o2.getName());

            if (flag==0){
                flag = o1.getAge()-o2.getAge();
            }

        return flag;
    }

}
