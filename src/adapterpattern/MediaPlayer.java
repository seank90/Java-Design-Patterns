package adapterpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 24/03/2016.
 */
public interface MediaPlayer {
    void play(@NotNull String audioType, @NotNull String filename);
}
