# VotingSystem
Developed an VotingSystem Using Springboot , Java , RestAPI's

Implementation Outline
#1. Data Structures Used

candidates (in VotingService):
Data Type: HashMap<String, Integer>
Purpose: To efficiently store candidate names and their corresponding vote counts.

2. Setup a Spring Boot Project
Create a new Spring Boot project using your preferred IDE or Spring Initializer.

3. Implement Controller and Service
Create a VotingController class to handle incoming HTTP requests.
Create a VotingService class to manage the business logic.

4. Implement Basic APIs
Implement the entercandidate API in the controller and service.
Implement the castvote API.
Implement the countvote API.

5. JSON Response
Ensure that the APIs return responses in JSON format.

6. Simultaneous Execution
Use appropriate synchronization mechanisms to handle simultaneous execution.

7. Unit Testing
Implement unit tests for each API in a separate VotingControllerTest class.

8. Documentation
Add Javadoc comments to explain the purpose of each class and method.

9. Run and Test
Run the application and test each API using tools like Postman or curl.

11. Additional Considerations
Handle edge cases, error scenarios, and input validation.
