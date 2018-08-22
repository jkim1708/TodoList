package academy.learnprogramming.service;

import academy.learnprogramming.model.TodoData;
import academy.learnprogramming.model.TodoItem;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    // == fields ==
    private final TodoData data = new TodoData();

    // == public methods ==
    @Override
    public void addItem(TodoItem toAddItem) {
        data.addItem(toAddItem);
    }

    @Override
    public void removeItem(int id) {
        data.removeÍtem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdateItem) {
        data.updateItem(toUpdateItem);
    }

    @Override
    public TodoData getData() {
        return data;
    }
}
