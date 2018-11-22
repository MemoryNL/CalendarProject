package version1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Schedule extends JPanel{
	int solar;
	int moon;
	ArrayList <String> todoList;
	JLabel solarDate;
	JLabel moonDate;
	public Schedule(int solar, int moon) {
		this.solar = solar;
		this.moon = moon;
		setLayout(new BorderLayout());
		solarDate = new JLabel(Integer.toString(solar));
		moonDate = new JLabel(Integer.toString(solar));
		solarDate.setHorizontalAlignment(JLabel.CENTER);
		moonDate.setHorizontalAlignment(JLabel.CENTER);
		add(solarDate,BorderLayout.NORTH);
		add(moonDate,BorderLayout.SOUTH);

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
	
}
