package version1;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JPanel;

public class DiaryPanel extends JPanel {

	Schedule schedule[][] = new Schedule[5][7];
	int solar[][] = new int[5][7];
	int moon[][] = new int[5][7];
	/**
	 * Create the panel.
	 */
	public DiaryPanel() {
		setLayout(new GridLayout(5,7));
		//달력 생성
		Calendar cal = Calendar.getInstance();
		 
		//현재 년도, 월, 일
		int currentYear = cal.get ( cal.YEAR );
		int currentMonth = cal.get ( cal.MONTH );
		int currentDay = cal.get ( cal.DATE ) ;
		 
		//현재 달 시작 요일
		cal.set(currentYear,currentMonth,1);
		int startOfMonthWeek = cal.getFirstDayOfWeek();
		
		// 현재 달 최대 날짜
	    int daysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	    // 이전 달 최대 날짜
	    int preDaysOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH-1);
	    
	    int day = 1;
	    // 맨 첫줄의 날짜를 입력한다..
		
	    for(int i = 0 ; i < startOfMonthWeek; i++) {
	    	solar[0][i] = preDaysOfMonth--;
	    }
	    for(int i = startOfMonthWeek ; i < 7 ; i++) {
	    	solar[0][i] = day++;
	    }
	    // 나머지 줄의 날짜를 입력한다.
		for(int i = 1 ; i < 5 ; i++) {
			for(int j = 0; j < 7 ; j++) {
				solar[i][j] = day++;
			}
		}
		
		for(int i = 0 ; i < 5 ; i ++) {
			for(int j = 0; j < 7 ; j++) {
				schedule[i][j] = new Schedule(solar[i][j],0);
				add(schedule[i][j]);
			}
		}
	}

}
