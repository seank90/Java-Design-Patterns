package filterpattern;

import java.util.List;

/**
 * Created by Sean Keane on 25/03/2016.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
