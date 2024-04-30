package class21;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayerDemo {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\barka\\IdeaProjects\\JavaBasic" +
                "\\src\\main\\java\\class21\\Ambient-music-free (1).mp3");

        Player p = new Player(fileInputStream);
    }
}
