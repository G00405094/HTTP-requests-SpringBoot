package ie.atu;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {

    @GetMapping("/todos")
    List<TodoResponse> fetchAllTodos();

    @GetMapping("/todos/{id}")
    TodoResponse fetchTodoById(@PathVariable("id") int id);
    @GetMapping("/todos/1")
    TodoResponse fetchData();
}
