package operation;

import person.PersonList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(PersonList personList) {
        int currentSize = personList.getPerson_num();
        for (int i = 0; i < currentSize; i++) {
            System.out.println(personList.getPersons(i));
        }
    }
}
