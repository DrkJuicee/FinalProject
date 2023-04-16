package test;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class CountingFrame {
	private final JFrame win = new JFrame();
	private JLabel countLabel;
	private JButton startStopButton;
	private Timer timer;
	private int count;

	public CountingFrame() {
		win.setTitle("Counting Frame");
		win.setSize(300, 200);
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		win.setLayout(new FlowLayout());

		countLabel = new JLabel("Count: 0");
		win.add(countLabel);

		startStopButton = new JButton("Start");
		startStopButton.addActionListener(e -> {
			if (e.getSource() == startStopButton)
				if (timer.isRunning()) {
					timer.stop();
					startStopButton.setText("Start");
				} else {
					timer.start();
					count = 10;
					startStopButton.setText("Stop");
				}
		});
		win.add(startStopButton);
		win.setVisible(true);
		timer = new Timer(250, e -> {
			if(count>0)
				countLabel.setText("Count: %d".formatted(--count));
				else {
					countLabel.setText("Fine");
					timer.stop();
				}
		});
	}
	public static void main(String[] args) {
		new CountingFrame();
	}
}
