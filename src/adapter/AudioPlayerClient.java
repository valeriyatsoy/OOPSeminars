package adapter;

public class AudioPlayerClient {
    private final Mp3Player player = new Mp3Player();

    public void play(AudioSource source) {
        String mp3 = source.getMp3File();
        player.playMp3(mp3);
    }

}
