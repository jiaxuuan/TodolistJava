//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	private Task task1;
	private Task task2;
	private Task task3;
	private ToDoList todoList;
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		task1 = new Task ("desc 1");
		task2 = new Task ("desc 2");
		task3 = new Task ("desc 3");
		
		todoList = new ToDoList();
	}
	@After
	 public void tearDown() throws Exception{
		task1 = null;
		task2 = null;
		task3 = null;
		
		todoList = null;
	}

	@Test
	public void testAddTask() {

	}
	@Test
	public void testgetStatus() {

	}
	@Test
	public void testRemoveTask() {

	}
	@Test
	public void testGetCompletedTasks() {

	}
}
