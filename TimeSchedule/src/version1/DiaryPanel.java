package version1;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class DiaryPanel extends JPanel {
	int r = 0;
	Schedule schedule[][] = new Schedule[6][7];
	int solar[][] = new int[6][7];
	int moon[][] = new int[6][7];
	/**
	 * Create the panel.
	 */
	public DiaryPanel() {
		setLayout(new GridLayout(6,7));
		//달력 생성
		CalendarEx current = new CalendarEx(r);
		CalendarEx pre = new CalendarEx(r-1);
	    // 맨 첫줄의 날짜를 입력한다.		
	    for(int i = current.DayofWeek-1 ; i > -1; i--) {
	    	solar[0][i] = pre.daysOfMonth--;
	    }
	    for(int i = current.DayofWeek ; i < 7 ; i++) {
	    	solar[0][i] = current.day++;
	    }
	    // 나머지 줄의 날짜를 입력한다.
		for(int i = 1 ; i < 6 ; i++) {
			for(int j = 0; j < 7 ; j++) {
				if(current.day > current.daysOfMonth) {
					current.day = 1;
				}
				solar[i][j] = current.day++;
			}
		}
		//날짜를 리셋하고, 패널을 배치한다. setLabel을 이용하여 현재 달이 아니면 회색표시.
		current.day = 1;
	    for(int i = 0 ; i < current.DayofWeek; i++) {
	    	schedule[0][i] = new Schedule(solar[0][i],0);
	    	schedule[0][i].setLabel();
	    	add(schedule[0][i]);
	    }
	    for(int i = current.DayofWeek ; i < 7 ; i++) {
	    	schedule[0][i] = new Schedule(solar[0][i],0);
			add(schedule[0][i]);
			current.day++;
	    }
	    for(int i = 1 ; i < 6 ; i++) {
			for(int j = 0; j < 7 ; j++) {
				schedule[i][j] = new Schedule(solar[i][j],0);
				if(current.day > current.daysOfMonth) {
					schedule[i][j].setLabel();
				}
				add(schedule[i][j]);
				current.day++;
			}
		}
	}

}
