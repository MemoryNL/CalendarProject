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

	// ���� ��ư �⺻ �̹���
	ImageIcon leftButtonBasicImage = new ImageIcon("images/leftButtonBasicImage.png");
	// ���� ��ư Enter �̹���
	ImageIcon leftButtonEnterImage = new ImageIcon("images/leftButtonEnterImage.png");
	// ������ ��ư �⺻ �̹���
	ImageIcon rightButtonBasicImage = new ImageIcon("images/rightButtonBasicImage.png");
	// ������ ��ư Enter �̹���
	ImageIcon rightButtonEnterImage = new ImageIcon("images/rightButtonEnterImage.png");

	// test
	/**
	 * Create the panel.
	 */
	public DatePanel() {
		JButton left = new JButton(leftButtonBasicImage);
		JButton right = new JButton(rightButtonBasicImage);
		// Button UI ����
		setButtonUI(left); setButtonUI(right);
		// Mouse �̺�Ʈ ó��
		left.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// Entered�̹����� ���� �����ش�.
				left.setIcon(leftButtonEnterImage);
				// Ŀ���� ����� �ٲ��ش�
				left.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// ȿ���� ���
			}

			// ���콺�� ��ư�� �������� �̺�Ʈ ó��
			@Override
			public void mouseExited(MouseEvent e) {
				left.setIcon(leftButtonBasicImage);
				// Ŀ���� ����� �ٲ��ش�
				left.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			// ��ư�� Ŭ�������� �̺�Ʈ ó��
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
		});
		right.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// Entered�̹����� ���� �����ش�.
				right.setIcon(rightButtonEnterImage);
				// Ŀ���� ����� �ٲ��ش�
				right.setCursor(new Cursor(Cursor.HAND_CURSOR));
				// ȿ���� ���
			}

			// ���콺�� ��ư�� �������� �̺�Ʈ ó��
			@Override
			public void mouseExited(MouseEvent e) {
				right.setIcon(rightButtonBasicImage);
				// Ŀ���� ����� �ٲ��ش�
				right.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			// ��ư�� Ŭ�������� �̺�Ʈ ó��
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		// ���̾ƿ� ����
		setLayout(new BorderLayout());
		// ��¥�� ǥ���� JLabel ����
		JLabel date = new JLabel("2018�� 11��");
		// ���ڻ� ����
		date.setForeground(new Color(238,83,79));
		// ��Ʈ ����
		Font font = new Font("�����ý��丮",Font.BOLD,20);
		// ��Ʈ ����
		date.setFont(font);
		// ���� ����
		date.setHorizontalAlignment(JLabel.CENTER);
		// ���ȭ�� ����
		setBackground(Color.WHITE);
		// ������Ʈ �߰�
		add(date,BorderLayout.CENTER);
		add(left,BorderLayout.WEST);
		add(right,BorderLayout.EAST);
	}
	
	public void setButtonUI(JButton button) {
		// �ܰ��� ����
		button.setBorderPainted(false);
		// ���� ü��� ����
		button.setContentAreaFilled(false);
		// ��Ŀ�� �Ǿ����� �׵θ� ����
		button.setFocusPainted(false);
	}

}
