package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarPanel extends JPanel {
	
	String weekend[] = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
	JPanel diaryPanel = new DiaryPanel();
	/**
	 * Create the panel.
	 */
	public CalendarPanel() {
		// ��Ʈ ����
		Font font = new Font("�����ý��丮",Font.BOLD,15);
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
		// weekPanel�� NORTH�� �߰�
		add(weekPanel,BorderLayout.NORTH);
		add(diaryPanel, BorderLayout.CENTER);
	}

}
