package task4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        MediaPlayer player = new AdvancedMediaPlayer();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в медиаплеер!");
        System.out.println("Доступные форматы: mp3, mp4, avi, flac.");

        while (true) {
            System.out.print("\nВведите тип файла (или 'exit' для выхода): ");
            String mediaType = scanner.nextLine().toLowerCase();

            if (mediaType.equals("exit")) {
                System.out.println("Выход из программы. Спасибо за использование!");
                break;
            }

            System.out.print("Введите имя файла: ");
            String fileName = scanner.nextLine();

            player.play(mediaType, fileName);
        }

        scanner.close();
    }
}
