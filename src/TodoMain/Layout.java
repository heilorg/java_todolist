package TodoMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout {
	private static JPanel panel;
	private static JButton addTodoButton;
	private static JTextField todoField;
	private static JFrame frame;
	private static Todo Todos = new Todo();
	
	public static void setup() {
		frame = new JFrame("타이틀");
		frame.setSize(800, 450);
		frame.setLayout(new GridLayout(1, 2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
		addTodoButton = new JButton("추가");
		addTodoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(todoField.getText());
				Todos.addTodo(todoField.getText());
				addLabel(todoField.getText());
			}
		});
		
		
		todoField = new JTextField(20);
		todoField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(todoField.getText());
				Todos.addTodo(todoField.getText());
				addLabel(todoField.getText());
			}
		});

		panel.add(todoField);
		panel.add(addTodoButton);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void addLabel(String todo) {
		panel.add(new JLabel(todo));
		frame.pack();
	}
}
