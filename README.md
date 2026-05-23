1. This is a Springboot backend application that can manage tasks by accessing the API via Postman. This shows that data doesn't have to be stored in the backend and can be reached with a database by fetching, creating, updating and deleting data there.


2. The application can be ran by running the "CampusTaskboardApplication.java" within the [campus-taskboard\src\main\java\edu\brooklyn\cisc3130\campus_taskboard] directory, that will then open up a compatiable IDE to which you can run the applcation.


3. API Documentation:
   // Fetches data from JSON.
   GET http://localhost:8080/api/tasks

   // Creates a new task.
   POST http://localhost:8080/api/tasks
     Header: Content-Type: application/json

   // Updates data from JSON.
   PUT http://localhost:8080/api/tasks
     Header: Content-Type: application/json

   // Deletes a task.
   DELETE http://localhost:8080/api/tasks
