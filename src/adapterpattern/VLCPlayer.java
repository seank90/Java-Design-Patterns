package adapterpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 24/03/2016.
 */
class VLCPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVLC(@NotNull String filename) {
        System.out.println("Playing VLC file : " + filename);
    }

    @Override
    public void playMP4(@NotNull String filename) {
        //Do nothing
    }
}
