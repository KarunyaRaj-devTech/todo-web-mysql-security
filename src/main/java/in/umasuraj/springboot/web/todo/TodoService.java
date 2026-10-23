package in.umasuraj.springboot.web.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

//	private static List<Todo> todos = new ArrayList<>();

//	private static int todosCount = 0;

//	static {
//		todos.add(new Todo(++todosCount, "umasuraj", "Get AWS Certified", LocalDate.now().plusYears(1), false));
//		todos.add(new Todo(++todosCount, "umasuraj", "Learn DevOps", LocalDate.now().plusYears(2), false));
//		todos.add(new Todo(++todosCount, "umasuraj", "Learn Full Stack Development", LocalDate.now().plusYears(3),
//				false));
//	}

//	public List<Todo> findByUsername(String username) {
//		Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
//
//		// return todos.stream().filter(predicate).collect(Collectors.toList());
//		return todos.stream().filter(predicate).toList();
//
//	}

//	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
//		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
//		todos.add(todo);
//	}

//	public void deleteById(int id) {
//		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//		todos.removeIf(predicate);
//	}

//	public Todo findById(int id) {
//		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//		Todo todo = todos.stream().filter(predicate).findFirst().orElseGet(null);
//		return todo;
//	}

//	public void updateTodo(@Valid Todo todo) {
//		deleteById(todo.getId());
//		todos.add(todo);
//	}

}
