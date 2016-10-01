package adapterpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 24/03/2016.
 */
public interface AdvancedMediaPlayer {
    void playVLC(@NotNull String filename);
    void playMP4(@NotNull String filename);
}
