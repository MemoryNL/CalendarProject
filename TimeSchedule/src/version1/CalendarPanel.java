package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
		// 폰트 선언
		Font font = new Font("메이플스토리",Font.BOLD,15);
		JPanel weekPanel = new JPanel();
		weekPanel.setLayout(new GridLayout(1,7));
		for(int i = 0 ; i < 7 ; i++) {
			JLabel weekendLabel = new JLabel(weekend[i]);
			if(i == 0) {
				weekendLabel.setForeground(Color.RED);
			} else if(i == 6) {
				weekendLabel.setForeground(Color.BLUE);
			}
			weekendLabel.setFont(font);
			weekendLabel.setHorizontalAlignment(JLabel.CENTER);
			weekendLabel.setBackground(Color.WHITE);
			weekendLabel.setOpaque(true);
			weekPanel.add(weekendLabel);
		}
		
		setLayout(new BorderLayout());
		// weekPanel을 NORTH에 추가
		add(weekPanel,BorderLayout.NORTH);
		add(diaryPanel, BorderLayout.CENTER);
	}

}
