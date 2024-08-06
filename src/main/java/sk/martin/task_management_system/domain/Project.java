package sk.martin.task_management_system.domain;

public class Project {
    private final long id;
    private final long user_Id;
    private final String name;
    private final String description;

    public Project(long id, long user_Id, String name, String description) {
        this.id = id;
        this.user_Id = user_Id;
        this.name = name;
        this.description = description;
    }
}
