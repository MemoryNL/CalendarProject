package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenubarPanel extends JPanel {
	JButton exitButton;
	JButton MainBtn, ScheduleBtn;
	// 종료 버튼 기본 이미지
	ImageIcon exitButtonBasicImage = new ImageIcon("images/ExitButton.png");
	// 종료 버튼 마우스 Enter시 이미지
	ImageIcon exitButtonEnterImage = new ImageIcon("images/ExitButtonEnter.png");

	/**
	 * Create the panel.
	 */
	public MenubarPanel() {
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 메뉴바 설정
		// exitButton 설정
		exitButton = new JButton(exitButtonBasicImage);
		MainBtn = new JButton("달력");
		ScheduleBtn = new JButton("스케줄표");
		// 외곽선 제거
		exitButton.setBorderPainted(false);
		// 내용 체우기 제거
		exitButton.setContentAreaFilled(false);
		// 포커스 되었을시 테두리 제거
		exitButton.setFocusPainted(false);
		add(exitButton, BorderLayout.NORTH);
	//	add(MainBtn, BorderLayout.CENTER);
	//	add(ScheduleBtn, BorderLayout.SOUTH);
		// 패널 배경화면 설정
		// 종료 버튼 이벤트 추가
		exitButton.addMouseListener(new ExitButtonEvent());
	}
	// 종료 버튼 이벤트 처리 클래스
	class ExitButtonEvent extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			// Entered이미지로 변경 시켜준다.
			exitButton.setIcon(exitButtonEnterImage);
			// 커서의 모양을 바꿔준다
			exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			// 효과음 재생
		}

		// 마우스가 버튼에 나갔을때 이벤트 처리
		@Override
		public void mouseExited(MouseEvent e) {
			exitButton.setIcon(exitButtonBasicImage);
			// 커서의 모양을 바꿔준다
			exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		}

		// 버튼을 클릭했을때 이벤트 처리
		@Override
		public void mousePressed(MouseEvent e) {
			// 프로그램 종료
			System.exit(0);
		}
	}
}
