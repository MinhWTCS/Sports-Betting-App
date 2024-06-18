import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {
private Clip clip;

public void playMusic(String musicFilePath) {
    try {
        File file = new File(musicFilePath);
        if (file.exists()) {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music
            clip.start();
        } else {
            System.out.println("Music file not found: " + musicFilePath);
        }
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        e.printStackTrace();
    }
}

public void stopMusic() {
    if (clip != null && clip.isRunning()) {
        clip.stop();
    }
}
}
