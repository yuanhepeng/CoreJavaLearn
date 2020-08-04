package VolumeOne.Chapter6.innerClass;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * This program demonstrates the use of inner classes. 
 * @author DELL
 * @version 1.8 2020年7月30日
 */
public class InnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.out.println(0);

	}
	
}

/**
 * A clock that prints the time in regular intervals.
 * @author DELL
 * @version 1.8 2020年7月30日
 */
class TalkingClock{
	private int interval;
	private boolean beep;
	
	/**
	 * Constructs a talking clock
	 * @param interval the interval betweem message (in milliseconds)
	 * @param beep true if the clock should beep
	 */
	public TalkingClock(int interval, boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * Starts the clock
	 */
	public void start(){
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone, the time is " + new Date());
			if (beep) {
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
	}
}

