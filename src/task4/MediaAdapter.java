package task4;

public class MediaAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;
    private FlacPlayer flacPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp4") || mediaType.equalsIgnoreCase("avi")) {
            videoPlayer = new VideoPlayer();
        } else if (mediaType.equalsIgnoreCase("flac")) {
            flacPlayer = new FlacPlayer();
        }
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp4") || mediaType.equalsIgnoreCase("avi")) {
            videoPlayer.playVideo(fileName);
        } else if (mediaType.equalsIgnoreCase("flac")) {
            flacPlayer.playFlac(fileName);
        } else {
            System.out.println("Формат " + mediaType + " не поддерживается адаптером.");
        }
    }
}
