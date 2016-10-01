package filterpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 25/03/2016.
 */
class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(@NotNull String name, @NotNull String gender, @NotNull String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
