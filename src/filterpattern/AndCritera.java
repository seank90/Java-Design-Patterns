package filterpattern;

import com.sun.istack.internal.NotNull;

import java.util.List;

/**
 * Created by Sean Keane on 25/03/2016.
 */
class AndCritera implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCritera(@NotNull Criteria criteria, @NotNull Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPerson = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPerson);
    }
}
