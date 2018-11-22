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
		// 화면 크기를 임의로 변경하지 못하게 설정
		setResizable(false);		
		// 배경화면을 검정으로 설정해준다.
		setBackground(Color.BLACK);
		// 화면 크기 지정
		setSize(450,800);
		// 메뉴바가 보이지 않게끔 설정
		setUndecorated(true);
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 배경화면 색 선정
		setBackground(Color.WHITE);
		
		JPanel menubar = new MenubarPanel();
		menubar.addMouseListener(new MouseAdapter() {
			// 마우스를 입력했을때 컴포넌트내의 마우스의 x좌표와 y좌표를 가져온다
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		// menuBar를 드래그 했을때 이벤트 처리를 해준다.
		menubar.addMouseMotionListener(new MouseMotionAdapter() {
			// 마우스를 입력했을때 스크린(모니터)내의 마우스의 x좌표와 y좌표를 가져온다
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				// 스크린내의 마우스의 좌표와 컴포넌트내의 마우스의 좌표의 차가 게임창의 위치이다.
				setLocation(x - mouseX, y - mouseY);
			}
		});
		
		add(menubar,BorderLayout.NORTH);
		
		JPanel mainPanel = new MainPanel();
		add(mainPanel,BorderLayout.CENTER);
		
		
		setVisible(true);
	}

}
