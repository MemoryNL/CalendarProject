package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setLayout(new BorderLayout());
		// North에 컴포넌트 추가
		JPanel datePanel = new DatePanel();
		JPanel calendarPanel = new CalendarPanel();
		// datePanel을 BorderLayout NORTH에 추가
		add(datePanel,BorderLayout.NORTH);
		// calendarPanel을 CENTER에 추가
		add(calendarPanel,BorderLayout.CENTER);
		
		
	}

}
