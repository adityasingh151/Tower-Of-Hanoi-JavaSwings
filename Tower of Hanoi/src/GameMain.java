import java.io.File;
import javax.sound.sampled.*;
import javax.swing.JFrame;

public class GameMain {
	static AudioInputStream audioInputStream;
	static Clip clip;

	public static void main(String[] args) {
		JFrame frame = new FirstPage();
		frame.setTitle("Tower Of Hanoi");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		music();
	}

	public static void music() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/sio.wav").getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	public static void buttonmusic() {
		try {
			AudioInputStream input = AudioSystem
					.getAudioInputStream(new File("sounds/mouseclick.wav").getAbsoluteFile());
			Clip c = AudioSystem.getClip();
			c.open(input);
			c.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	public static void buttonsuccess() {
		try {
			AudioInputStream input = AudioSystem
					.getAudioInputStream(new File("sounds/lvlcomplete.wav").getAbsoluteFile());
			Clip c = AudioSystem.getClip();
			c.open(input);
			c.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	public static void buttonfail() {
		try {
			AudioInputStream input = AudioSystem
					.getAudioInputStream(new File("sounds/wrongmove.wav").getAbsoluteFile());
			Clip c = AudioSystem.getClip();
			c.open(input);
			c.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
}