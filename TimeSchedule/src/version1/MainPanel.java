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
		// North�� ������Ʈ �߰�
		JPanel datePanel = new DatePanel();
		JPanel calendarPanel = new CalendarPanel();
		add(datePanel,BorderLayout.NORTH);
		add(calendarPanel,BorderLayout.CENTER);
		
		
	}

}
