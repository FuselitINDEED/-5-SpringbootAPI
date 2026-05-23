1. This is a Springboot backend application that can manage tasks by accessing the API via Postman. This shows that data doesn't have to be stored in the backend and can be reached with a database by fetching, creating, updating and deleting data there.
--------------------------------------------
2. The application can be ran by running the "CampusTaskboardApplication.java" within the [campus-taskboard\src\main\java\edu\brooklyn\cisc3130\campus_taskboard] directory, that will then open up a compatiable IDE to which you can run the applcation.
--------------------------------------------
3. API Documentation:
--------------------------------------------
  * // Fetches data from JSON.
  * GET http://localhost:8080/api/tasks
--------------------------------------------
  * // Creates a new task.
  * POST http://localhost:8080/api/tasks
     * Header: Content-Type: application/json
--------------------------------------------
  * // Updates data from JSON.
  * PUT http://localhost:8080/api/tasks
     *  Header: Content-Type: application/json
--------------------------------------------
  * // Deletes a task.
  * DELETE http://localhost:8080/api/tasks

Get All Tasks
<img width="1920" height="1080" alt="Get All Task" src="https://github.com/user-attachments/assets/fc614e1c-d0f2-42c8-87b4-335a9ccf3a77" />

Creating a Task
<img width="1920" height="1080" alt="Create a Task" src="https://github.com/user-attachments/assets/0219cd7c-1464-479e-bbf7-97775038e811" />

Updating a Task
<img width="1920" height="1080" alt="Update Task" src="https://github.com/user-attachments/assets/63868f33-0b0d-48fa-bec7-ed537b42be1b" />

Deleting a Task
<img width="1920" height="1080" alt="Delete Task" src="https://github.com/user-attachments/assets/bb3c4456-6faa-4ffc-9965-4df5ce49b65d" />

Test Validation
<img width="1920" height="1080" alt="Test Validation" src="https://github.com/user-attachments/assets/ed056d9e-3d71-4d41-8c97-dd0203c2a6f7" />
