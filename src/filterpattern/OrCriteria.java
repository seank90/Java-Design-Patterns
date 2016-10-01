package filterpattern;

import com.sun.istack.internal.NotNull;

import java.util.List;

/**
 * Created by Sean Keane on 25/03/2016.
 */
class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(@NotNull Criteria criteria, @NotNull Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteraItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteraItems) {
            if (!otherCriteraItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
