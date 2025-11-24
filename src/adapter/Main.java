package adapter;

public class Main {
    public static void main(String[] args) {
        StreamingAudio stream = new StreamingAudio("https://music.com/song/77");

        AudioSource adapted = new StreamingToMp3Adapter(stream);

        AudioPlayerClient client = new AudioPlayerClient();
        client.play(adapted);

    }
}