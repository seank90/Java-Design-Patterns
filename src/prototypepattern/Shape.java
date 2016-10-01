package prototypepattern;

import com.sun.istack.internal.Nullable;
import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 23/03/2016.
 */
abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    @Nullable
    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
