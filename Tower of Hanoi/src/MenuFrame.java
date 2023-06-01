
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class MenuFrame extends JFrame {
	ImagePanel panel = new ImagePanel();
	JButton newGame = new JButton(panel.imageNewGame);
	JButton loadGame = new JButton(panel.imageLoadGame);
	JButton howToPlay = new JButton(panel.imageOption);
	JButton back = new JButton(panel.imageBack);

	public MenuFrame() {
		init();
		addMenuFrameActionListener();
	}

	public void init() {
		newGame.setBounds(520, 250, 200, 45);
		newGame.setBorder(null);
		loadGame.setBounds(520, 300, 200, 45);
		loadGame.setBorder(null);
		howToPlay.setBounds(520, 350, 200, 45);
		howToPlay.setBorder(null);
		back.setBounds(520, 400, 200, 45);
		back.setBorder(null);

		this.add(newGame);
		this.add(loadGame);
		this.add(howToPlay);
		this.add(back);
		this.add(panel);
	}

	public void addMenuFrameActionListener() {
		loadGame.addActionListener(new newGameAction1());
		loadGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GameMain.clip.close();
				GameMain.buttonmusic();
				setVisible(false);

			}
		});

		newGame.addActionListener(new newGameAction());
		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameMain.clip.close();
				GameMain.buttonmusic();
				setVisible(false);

			}
		});

		back.addActionListener(new backPage());
		howToPlay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameMain.buttonmusic();
				HowToPlay newFrame = new HowToPlay();
				newFrame.setTitle("How To Play");
				newFrame.setSize(800, 600);
				newFrame.setLocationRelativeTo(null);
				newFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				newFrame.setVisible(true);
				newFrame.setResizable(false);
			}
		});

		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	public class ImagePanel extends JPanel {
		private ImageIcon imageIcon = new ImageIcon("images/untitle.jpg");
		private ImageIcon imageNewGame = new ImageIcon("images/newgame.jpg");
		private ImageIcon imageLoadGame = new ImageIcon("images/loadgame.jpg");
		private ImageIcon imageOption = new ImageIcon("images/option.jpg");
		private ImageIcon imageBack = new ImageIcon("images/back.jpg");
		private Image image = imageIcon.getImage();

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

		}
	}
}

class newGameAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		GameHold mDraw = new GameHold("Tower Of Hanoi", 1);
		try {
			Clip clip = AudioSystem.getClip();
			System.out.println(clip.getFormat());
			clip.stop();
		} catch (LineUnavailableException e1) {
			e1.printStackTrace();
		}
	}
}

class newGameAction1 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		try {
			DataInputStream input = new DataInputStream(new FileInputStream("images/input.txt"));
			int x = input.readInt();
			input.close();
			System.out.println("here is XX: " + x);
			GameHold hold = new GameHold("Tower Of Hanoi", x);
		} catch (IOException ex) {
			System.out.println("Problem with Input Output FIle");
		}
	}
}
