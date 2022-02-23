package structuralPatterns.adapter.adapterExample4;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.pley("mp3", "beyond the horizon.mp3");
        audioPlayer.pley("mp4", "alone.mp4");
        audioPlayer.pley("vlc", "far far away.vlc");
        audioPlayer.pley("avi", "mind me.avi");

    }
}
