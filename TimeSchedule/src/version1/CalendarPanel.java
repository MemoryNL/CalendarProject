package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarPanel extends JPanel {
	
	String weekend[] = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
	JPanel diaryPanel = new DiaryPanel();
	/**
	 * Create the panel.
	 */
	public CalendarPanel() {
		JPanel weekPanel = new JPanel();
		weekPanel.setLayout(new GridLayout(1,7));
		for(int i = 0 ; i < 7 ; i++) {
			JLabel weekendLabel = new JLabel(weekend[i]);
			if(i == 0) {
				weekendLabel.setForeground(Color.RED);
			} else if(i == 6) {
				weekendLabel.setForeground(Color.BLUE);
			}
			weekendLabel.setHorizontalAlignment(JLabel.CENTER);
			weekendLabel.setBackground(Color.WHITE);
			weekendLabel.setOpaque(true);
			weekPanel.add(weekendLabel);
		}
		
		setLayout(new BorderLayout());
		add(diaryPanel, BorderLayout.CENTER);
		add(weekPanel,BorderLayout.NORTH);
		
	}

}
