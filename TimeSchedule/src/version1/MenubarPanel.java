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
	// ���� ��ư �⺻ �̹���
	ImageIcon exitButtonBasicImage = new ImageIcon("images/ExitButton.png");
	// ���� ��ư ���콺 Enter�� �̹���
	ImageIcon exitButtonEnterImage = new ImageIcon("images/ExitButtonEnter.png");

	/**
	 * Create the panel.
	 */
	public MenubarPanel() {
		// ���̾ƿ� ����
		setLayout(new BorderLayout());
		// �޴��� ����
		// exitButton ����
		exitButton = new JButton(exitButtonBasicImage);
		MainBtn = new JButton("�޷�");
		ScheduleBtn = new JButton("������ǥ");
		// �ܰ��� ����
		exitButton.setBorderPainted(false);
		// ���� ü��� ����
		exitButton.setContentAreaFilled(false);
		// ��Ŀ�� �Ǿ����� �׵θ� ����
		exitButton.setFocusPainted(false);
		add(exitButton, BorderLayout.NORTH);
	//	add(MainBtn, BorderLayout.CENTER);
	//	add(ScheduleBtn, BorderLayout.SOUTH);
		// �г� ���ȭ�� ����
		// ���� ��ư �̺�Ʈ �߰�
		exitButton.addMouseListener(new ExitButtonEvent());
	}
	// ���� ��ư �̺�Ʈ ó�� Ŭ����
	class ExitButtonEvent extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			// Entered�̹����� ���� �����ش�.
			exitButton.setIcon(exitButtonEnterImage);
			// Ŀ���� ����� �ٲ��ش�
			exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			// ȿ���� ���
		}

		// ���콺�� ��ư�� �������� �̺�Ʈ ó��
		@Override
		public void mouseExited(MouseEvent e) {
			exitButton.setIcon(exitButtonBasicImage);
			// Ŀ���� ����� �ٲ��ش�
			exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		}

		// ��ư�� Ŭ�������� �̺�Ʈ ó��
		@Override
		public void mousePressed(MouseEvent e) {
			// ���α׷� ����
			System.exit(0);
		}
	}
}
