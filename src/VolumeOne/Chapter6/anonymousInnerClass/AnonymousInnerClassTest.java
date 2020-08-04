package VolumeOne.Chapter6.anonymousInnerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * This program demonstrates annoynous inner class.
 * @author DELL
 * @version 1.8 2020年7月31日
 */
public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);

	}

}


/**
 * A clock that prints the time in retgular intgervals.
 * @author DELL
 * @version 1.8 2020年7月31日
 */
class TalkingClock{
	
	public void start(int interval, boolean beep){
		ActionListener actionListener = new ActionListener() {
			
			/**
			 * Starts the clock.
			 * @param interval the inverval between messages (in milliseconds)
			 * @param beep true if the clock should beep
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("At the tone, the time is " + new Date());
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		
		Timer timer = new Timer(interval, actionListener);
		timer.start();
 	}
}