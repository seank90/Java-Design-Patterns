package adapterpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 24/03/2016.
 */
class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(@NotNull String audioType, @NotNull String filename) {
        //inbuilt support to play MP3 files
        if (audioType.equalsIgnoreCase(MediaAdapter.MP3)){
            System.out.println("Playing MP3 file: " + filename);
        }
        //media adapter is supplying support to play other formats
        else if (audioType.equalsIgnoreCase(MediaAdapter.MP4) || audioType.equalsIgnoreCase(MediaAdapter.VLC)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid media " + audioType + " format not supported");
        }
    }
}
