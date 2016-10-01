package filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean Keane on 25/03/2016.
 */
class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
