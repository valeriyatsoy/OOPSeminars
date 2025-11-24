package adapter;

public class StreamingToMp3Adapter implements AudioSource {
    private final StreamingAudio streamingAudio;

    public StreamingToMp3Adapter(StreamingAudio streamingAudio) {
        this.streamingAudio = streamingAudio;
    }

    @Override
    public String getMp3File() {
        // Convert a streaming URL into a “virtual mp3 file”
        String url = streamingAudio.getStreamUrl();
        return convertToMp3(url);
    }

    private String convertToMp3(String url) {
        // Simulated conversion (in real life, this would download and re-encode)
        return "converted_" + url.hashCode() + ".mp3";
    }
}

