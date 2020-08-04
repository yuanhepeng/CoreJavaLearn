package VolumeOne.Chapter6.timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

/**
 * 
 * @author DELL
 * @version 1.8 2020Äê7ÔÂ29ÈÕ
 */
public class TimerTest {

	public static void main(String[] args) {
		ActionListener listener = new TimePrinter();
		// construct a timer that calls the listener
		// once every 10 seconds
		Timer t = new Timer(100000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);

	}
}

class TimePrinter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("At the tone, the time is " + new Date());
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}
