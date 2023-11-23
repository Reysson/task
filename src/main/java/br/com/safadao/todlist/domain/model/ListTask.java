package br.com.safadao.todlist.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "list_task")
public class ListTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany
    @JoinTable(name = "list_task_todo", joinColumns = @JoinColumn(name = "list_task_id"), inverseJoinColumns = @JoinColumn(name = "todo_id"))
    private List<Todo> tasks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Todo> getTasks() {
        return tasks;
    }

    public void setTasks(List<Todo> tasks) {
        this.tasks = tasks;
    }
}
