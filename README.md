TASK MANAGEMENT API
- A simple Spring Boot REST API for managing tasks that supports creating, reading, updating, and deleting tasks, as well as tracking their status.

Features:
- Create a new task with ID, title, description, and status
- Retrieve all tasks or a specific task by ID
- Update existing tasks
- Delete tasks
- Task statuses: TO_DO, IN_PROGRESS, COMPLETED, BLOCKED

Technologies:
- Java 17+ (or compatible)
- Spring Boot
- Maven
- Postman (for API testing)

Instructions to run the project:
- Open the project in IntelliJ IDEA, ensure the Java SDK is set to 17+, and build it using Maven.
- Run the TaskApplication main class to start the Spring Boot server, then access the API at http://localhost:8080.

Json Sample Dataset: 
{
    "title": "Buy groceries",
    "description": "Milk, Bread, Eggs, and Fruits",
    "status": "TO_DO"
  }

  Controller Operation:
  - get all: http://localhost:8080/tasks
  - get by id: http://localhost:8080/tasks/{id}
  - put: http://localhost:8080/tasks/{id}
  - post: http://localhost:8080/tasks
  - delete: http://localhost:8080/tasks/{id}





