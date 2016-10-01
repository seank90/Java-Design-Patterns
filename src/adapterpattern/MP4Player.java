package adapterpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 24/03/2016.
 */
class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(@NotNull String filename) {
        //do nothing
    }

    @Override
    public void playMP4(@NotNull String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}
