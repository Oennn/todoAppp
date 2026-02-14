package repositories;

public class TodoRepository {
    private DatabaseConnexion databaseConnexion;

    public TodoRepository(DatabaseConnexion databaseConnexion) {
        this.databaseConnexion = databaseConnexion;
    }

    public ArrayList<Todo> getList() {
        return;
    }

    public int create(Todo todo) {
        return;
    }
    public void delete(int id) {
        return;
    }
     public void update(Todo todo) {
        return;
    }

}