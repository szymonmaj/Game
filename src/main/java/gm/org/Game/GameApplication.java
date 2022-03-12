package gm.org.Game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.*;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
	JFrame frame1 = new JFrame ("Puste okno");
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.setBounds(100, 100, 200, 200);
	frame1.setVisible(true);
	}

}
