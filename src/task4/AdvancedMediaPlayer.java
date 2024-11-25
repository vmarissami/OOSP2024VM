package task4;

public class AdvancedMediaPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("Воспроизведение MP3 файла: " + fileName);
        } else if (mediaType.equalsIgnoreCase("mp4") ||
                mediaType.equalsIgnoreCase("avi") ||
                mediaType.equalsIgnoreCase("flac")) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Формат " + mediaType + " не поддерживается.");
        }
    }
}
