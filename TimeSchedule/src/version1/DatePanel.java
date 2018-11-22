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

public class DatePanel extends JPanel {

	// 왼쪽 버튼 기본 이미지
	ImageIcon leftButtonBasicImage = new ImageIcon("images/leftButtonBasicImage.png");
	// 왼쪽 버튼 Enter 이미지
	ImageIcon leftButtonEnterImage = new ImageIcon("images/leftButtonEnterImage.png");
	// 오른쪽 버튼 기본 이미지
	ImageIcon rightButtonBasicImage = new ImageIcon("images/rightButtonBasicImage.png");
	// 오른쪽 버튼 Enter 이미지
	ImageIcon rightButtonEnterImage = new ImageIcon("images/rightButtonEnterImage.png");


	/**
	 * Create the panel.
	 */
	public DatePanel() {
		JButton left = new JButton(leftButtonBasicImage);
		JButton right = new JButton(rightButtonBasicImage);
		// Button UI 설정
		setButtonUI(left); setButtonUI(right);
		// Mouse 이벤트 처리
		left.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// Entered이미지로 변경 시켜준다.
				left.setIcon(leftButtonEnterImage);
				// 커서의 모양을 바꿔준다
				left.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// 효과음 재생
			}

			// 마우스가 버튼에 나갔을때 이벤트 처리
			@Override
			public void mouseExited(MouseEvent e) {
				left.setIcon(leftButtonBasicImage);
				// 커서의 모양을 바꿔준다
				left.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			// 버튼을 클릭했을때 이벤트 처리
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
		});
		right.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// Entered이미지로 변경 시켜준다.
				right.setIcon(rightButtonEnterImage);
				// 커서의 모양을 바꿔준다
				right.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// 효과음 재생
			}

			// 마우스가 버튼에 나갔을때 이벤트 처리
			@Override
			public void mouseExited(MouseEvent e) {
				right.setIcon(rightButtonBasicImage);
				// 커서의 모양을 바꿔준다
				right.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			// 버튼을 클릭했을때 이벤트 처리
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 날짜를 표현할 JLabel 선언
		JLabel date = new JLabel("2018년 11월");
		// 글자색 지정
		date.setForeground(new Color(238,83,79));
		// 폰트 선언
		Font font = new Font("메이플스토리",Font.BOLD,20);
		// 폰트 지정
		date.setFont(font);
		// 글자 정렬
		date.setHorizontalAlignment(JLabel.CENTER);
		// 배경화면 설정
		setBackground(Color.WHITE);
		// 컴포넌트 추가
		add(date,BorderLayout.CENTER);
		add(left,BorderLayout.WEST);
		add(right,BorderLayout.EAST);
	}
	
	public void setButtonUI(JButton button) {
		// 외곽선 제거
		button.setBorderPainted(false);
		// 내용 체우기 제거
		button.setContentAreaFilled(false);
		// 포커스 되었을시 테두리 제거
		button.setFocusPainted(false);
	}

}
