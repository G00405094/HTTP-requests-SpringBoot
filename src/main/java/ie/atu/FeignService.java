package ie.atu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient){
        this.todoClient = todoClient;
    }

    public List<TodoResponse> fetchAllTodos() {
        return todoClient.fetchAllTodos();
    }

    public TodoResponse fetchTodoById(int id) {
        return todoClient.fetchTodoById(id);
    }
    public TodoResponse fetchData(){
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return td;
    }
}
