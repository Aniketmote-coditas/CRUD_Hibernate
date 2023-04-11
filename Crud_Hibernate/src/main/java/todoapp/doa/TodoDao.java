package todoapp.doa;

import todoapp.model.Todo;

import java.sql.SQLException;
import java.util.List;



public interface TodoDao {

    void insertTodo(Todo todo) throws SQLException;

    //void insertTodo(Todo todo) throws SQLException;

    Todo selectTodo(long todoId);

    List<Todo> selectAllTodos();

    boolean deleteTodo(long id) throws SQLException;

    void updateTodo(Todo todo) throws SQLException;

}