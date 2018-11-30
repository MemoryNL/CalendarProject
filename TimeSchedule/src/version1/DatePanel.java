package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Calendar;

public class DatePanel extends JPanel {
	int r=0;
	JLabel logo;
	// 좌측 월 변경 버튼 이미지 설정
	ImageIcon leftButtonBasicImage = new ImageIcon("images/leftButtonBasicImage.png");
	// 좌측 월 변경 버튼 이미지 설정. 마우스를 올렸을 때.
	ImageIcon leftButtonEnterImage = new ImageIcon("images/leftButtonEnterImage.png");
	// 우측 월 변경 버튼 이미지 설정
	ImageIcon rightButtonBasicImage = new ImageIcon("images/rightButtonBasicImage.png");
	// 우측 월 변경 버튼 이미지 설정. 마우스를 올렸을 때.
	ImageIcon rightButtonEnterImage = new ImageIcon("images/rightButtonEnterImage.png");
	// Logo 이미지
	ImageIcon logoImage =new ImageIcon("images/logo.png");
	// test
	/**
	 * Create the panel.
	 */
	public DatePanel() {
		//현재 시간 정보를 지닌 달력 생성
		CalendarEx current = new CalendarEx(r);
		// 현재 년도와 월수를 표현하는 date 라벨 생성, Month값은 0이 1월이므로 +1.
		JLabel date = new JLabel(current.Year + "년 " + (current.Month+1) +"월");
		JButton left = new JButton(leftButtonBasicImage);
		JButton right = new JButton(rightButtonBasicImage);
		// Button UI 占쏙옙占쏙옙
		setButtonUI(left); setButtonUI(right);
		// Mouse 占싱븝옙트 처占쏙옙
		left.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// Entered占싱뱄옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌔댐옙.
				left.setIcon(leftButtonEnterImage);
				// 커占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쌕뀐옙占쌔댐옙
				left.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// 효占쏙옙占쏙옙 占쏙옙占�
			}

			// 占쏙옙占쎌스占쏙옙 占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占싱븝옙트 처占쏙옙
			@Override
			public void mouseExited(MouseEvent e) {
				left.setIcon(leftButtonBasicImage);
				// 커占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쌕뀐옙占쌔댐옙
				left.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			// 占쏙옙튼占쏙옙 클占쏙옙占쏙옙占쏙옙占쏙옙 占싱븝옙트 처占쏙옙
			@Override
			public void mousePressed(MouseEvent e) {
				//버튼 클릭시 월 변경
				r--;
				CalendarEx current = new CalendarEx(r);
				date.setText(current.Year + "년 " + (current.Month+1) +"월");
			}
			
		});
		right.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// Entered占싱뱄옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쌔댐옙.
				right.setIcon(rightButtonEnterImage);
				// 커占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쌕뀐옙占쌔댐옙
				right.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// 효占쏙옙占쏙옙 占쏙옙占�
			}

			// 占쏙옙占쎌스占쏙옙 占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占싱븝옙트 처占쏙옙
			@Override
			public void mouseExited(MouseEvent e) {
				right.setIcon(rightButtonBasicImage);
				// 커占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쌕뀐옙占쌔댐옙
				right.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			// 占쏙옙튼占쏙옙 클占쏙옙占쏙옙占쏙옙占쏙옙 占싱븝옙트 처占쏙옙
			@Override
			public void mousePressed(MouseEvent e) {
				//버튼 클릭시 월 변경
				r++;
				CalendarEx current = new CalendarEx(r);
				date.setText(current.Year + "년 " + (current.Month+1) +"월");
			}
		});
		logo = new JLabel(logoImage);
		// 占쏙옙占싱아울옙 占쏙옙占쏙옙
		setLayout(new BorderLayout());
		// 占쏙옙占쌘삼옙 占쏙옙占쏙옙
		date.setForeground(new Color(238,83,79));
		// 占쏙옙트 占쏙옙占쏙옙
		Font font = new Font("메이플스토리",Font.BOLD,20);
		// 占쏙옙트 占쏙옙占쏙옙
		date.setFont(font);
		// 占쏙옙占쏙옙 占쏙옙占쏙옙
		date.setHorizontalAlignment(JLabel.CENTER);
		// 로고 이미지와 같은 배경색으로 설정
		setBackground(new Color(195,241,199));
		// 占쏙옙占쏙옙占쏙옙트 占쌩곤옙
		add(logo,BorderLayout.NORTH);
		add(date,BorderLayout.CENTER);
		add(left,BorderLayout.WEST);
		add(right,BorderLayout.EAST);
		
	}
	
	public void setButtonUI(JButton button) {
		// 이미지 경계선을 지운다.
		button.setBorderPainted(false);
		// 占쏙옙占쏙옙 체占쏙옙占� 占쏙옙占쏙옙
		button.setContentAreaFilled(false);
		// 占쏙옙커占쏙옙 占실억옙占쏙옙占쏙옙 占쌓두몌옙 占쏙옙占쏙옙
		button.setFocusPainted(false);
	}

}
