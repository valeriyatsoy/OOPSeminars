package adapter;

public class StreamingAudio {
    private final String url;

    public StreamingAudio(String url) {
        this.url = url;
    }

    public String getStreamUrl() {
        return url;
    }

}
