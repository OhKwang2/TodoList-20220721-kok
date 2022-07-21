package com.springboot.todolist.domain.todolist;

import java.util.List;

public interface TodoListRepository {
	public int save(TodoList list);
	public TodoList findListByContentcode(int contentcode);
	public List<TodoList> getTodoListOfIndex(int index);
}
