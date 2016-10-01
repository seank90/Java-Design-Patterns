package adapterpattern;


import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 24/03/2016.
 */
class MediaAdapter implements MediaPlayer {

    protected static final String VLC = "vlc";
    protected static final String MP4 = "mp4";
    protected static final String MP3 = "mp3";

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(@NotNull String audioType){
        if (audioType.equalsIgnoreCase(VLC)){
            advancedMediaPlayer = new VLCPlayer();
        }else if (audioType.equalsIgnoreCase(MP4)){
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(@NotNull String audioType, @NotNull String filename) {
        if (audioType.equalsIgnoreCase(VLC)){
            advancedMediaPlayer.playVLC(filename);
        } else if (audioType.equalsIgnoreCase(MP4)){
            advancedMediaPlayer.playMP4(filename);
        }
    }
}
