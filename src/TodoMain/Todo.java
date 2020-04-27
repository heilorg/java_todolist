package TodoMain;

import java.util.ArrayList;
import java.util.List;

public class Todo {
	private List<String> todos = new ArrayList();
	public void addTodo(String todo){
		this.todos.add(todo);
	}
}
