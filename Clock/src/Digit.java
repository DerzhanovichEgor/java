import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.awt.Cursor;

public class Digit extends JFrame {
	private String time;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Digit frame = new Digit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Digit() {
		final JLabel a = new JLabel();
		a.setFont(new Font("Tahoma", Font.PLAIN, 70));
		a.setHorizontalTextPosition(SwingConstants.CENTER);
		a.setHorizontalAlignment(SwingConstants.CENTER);
	     new Thread() {
	            public void run() {
	                try {
	                    for (; ; ) {
	                        Calendar cal = new GregorianCalendar();
	                        int year = cal.get(Calendar.YEAR);
	                        int month = cal.get(Calendar.MONTH);
	                        int day = cal.get(Calendar.DAY_OF_MONTH);

	                        int hour = cal.get(Calendar.HOUR);
	                        int min = cal.get(Calendar.MINUTE);
	                        int sec = cal.get(Calendar.SECOND);
	                        int am_pm = cal.get(Calendar.AM_PM);
	                        String showPm_am = "";


	                        if (am_pm == 1) {
	                            showPm_am = "PM";
	                        } else {
	                            showPm_am = "AM";
	                        }
	                       time = hour + ":" + min + ":" + sec + " " + showPm_am;
	                       a.setText(time);
	                       
	                        
	                    }

	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        }.start();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		contentPane.add(a, BorderLayout.CENTER);
		
		
	}

}
