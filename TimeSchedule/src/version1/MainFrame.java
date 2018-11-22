package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	int mouseX;
	int mouseY;

	// Launch the application.
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
	}

	// create Frame
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ȭ�� ũ�⸦ ���Ƿ� �������� ���ϰ� ����
		setResizable(false);		
		// ���ȭ���� �������� �������ش�.
		setBackground(Color.BLACK);
		// ȭ�� ũ�� ����
		setSize(450,800);
		// �޴��ٰ� ������ �ʰԲ� ����
		setUndecorated(true);
		// ���̾ƿ� ����
		setLayout(new BorderLayout());
		// ���ȭ�� �� ����
		setBackground(Color.WHITE);
		
		JPanel menubar = new MenubarPanel();
		menubar.addMouseListener(new MouseAdapter() {
			// ���콺�� �Է������� ������Ʈ���� ���콺�� x��ǥ�� y��ǥ�� �����´�
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		// menuBar�� �巡�� ������ �̺�Ʈ ó���� ���ش�.
		menubar.addMouseMotionListener(new MouseMotionAdapter() {
			// ���콺�� �Է������� ��ũ��(�����)���� ���콺�� x��ǥ�� y��ǥ�� �����´�
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				// ��ũ������ ���콺�� ��ǥ�� ������Ʈ���� ���콺�� ��ǥ�� ���� ����â�� ��ġ�̴�.
				setLocation(x - mouseX, y - mouseY);
			}
		});
		
		add(menubar,BorderLayout.NORTH);
		
		JPanel mainPanel = new MainPanel();
		add(mainPanel,BorderLayout.CENTER);
		
		
		setVisible(true);
	}

}
