package task4;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("Воспроизведение MP3 файла: " + fileName);
        } else {
            System.out.println("Формат " + mediaType + " не поддерживается аудио-плеером.");
        }
    }
}
