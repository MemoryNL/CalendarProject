package version1;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class DiaryPanel extends JPanel {

	Schedule schedule[][] = new Schedule[5][7];
	/**
	 * Create the panel.
	 */
	public DiaryPanel() {
		setLayout(new GridLayout(5,7));

		
		int count = 0;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0; j < 7 ; j++) {
				schedule[i][j] = new Schedule(count,count);
				count++;
				add(schedule[i][j]);
			}
		}
	}

}
