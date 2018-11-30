package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Schedule extends JPanel{
	int solar;
	int moon;
	ArrayList <String> todoList;
	JLabel solarDate;
	JLabel moonDate;

	// 폰트 선언
	Font font = new Font("메이플스토리",Font.BOLD,20);
	
	public Schedule(int solar, int moon) {
		setLayout(new BorderLayout());
		
		this.solar = solar;
		this.moon = moon;
		solarDate = new JLabel(Integer.toString(solar));
		moonDate = new JLabel(Integer.toString(solar));
		solarDate.setHorizontalAlignment(JLabel.CENTER);
		moonDate.setHorizontalAlignment(JLabel.CENTER);
		add(solarDate,BorderLayout.NORTH);
		add(moonDate,BorderLayout.SOUTH);
		solarDate.setFont(font);
		moonDate.setFont(font);
		setBackground(Color.WHITE);
	}
	public void updateTodo() {
		JLabel todo[] = new JLabel[todoList.size()];
		for (int i = 0 ; i < todo.length ; i++) {
			todo[i] = new JLabel(todoList.get(i));
			add(todo[i], BorderLayout.CENTER);
		}
		
	}
	public int getSolar() {
		return solar;
	}
	public void setSolar(int solar) {
		this.solar = solar;
	}
	public int getMoon() {
		return moon;
	}
	public void setMoon(int moon) {
		this.moon = moon;
	}
	public ArrayList<String> getTodoList() {
		return todoList;
	}
	public void setTodoList(ArrayList<String> todoList) {
		this.todoList = todoList;
	}
	//패널의 날짜부분을 회색으로 만들어주는 메소드
	public void setLabel() {
		this.solarDate.setForeground(Color.LIGHT_GRAY);
		this.moonDate.setForeground(Color.LIGHT_GRAY);
	}
}
