import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Scanner;


public class PlayMP3 {
    public static void main(String[] args) {
  
    	
    	URL url  = PlayMP3.class.getClassLoader().getResource("야생화.mp3");
    	
    	try {
			URI uri = url.toURI();
			File file = new File(uri);
			System.out.println(file.getCanonicalPath());
			MP3Player mp3Player = new MP3Player(file.getCanonicalPath());
			mp3Player.play();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	
    	
//        String filename = "G:\\lmj\\2 -달묘전설.mp3";
//        MP3Player mp3Player = new MP3Player(filename);
//        mp3Player.play();

        Scanner sc = new Scanner(System.in);

        System.out.println("Write stop to stop the music: ");

//        if (sc.nextLine().equalsIgnoreCase("stop")) {
//            mp3Player.close();
//        }

    }
}

class MP3Player {
    private final String mp3FileToPlay;
    private Player jlPlayer;

    public MP3Player(String mp3FileToPlay) {
        this.mp3FileToPlay = mp3FileToPlay;
    }

    public void play() {
        try {
            FileInputStream fileInputStream = new FileInputStream(mp3FileToPlay);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            jlPlayer = new Player(bufferedInputStream);
        } catch (Exception e) {
            System.out.println("Problem playing mp3 file " + mp3FileToPlay);
            System.out.println(e.getMessage());
        }

        new Thread() {
            public void run() {
                try {
                    jlPlayer.play();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }.start();


    }
    
    public void close() {
        if (jlPlayer != null) jlPlayer.close();
    }
}