You can clone the repository and run the Spring app in the IDE. 

You can use Postman for the Rest Calls to retrieve the information: 
1. To fetch the doctors: 
GET: localhost:8080/doctor will fetch from mysql database at the backend. 
Will need to connect the mysql using: jdbc:mysql://localhost:3306/restapi
usernmame: root and pwd: root12345 

2. Create a doctor:
POST: localhost:8080/doctor and provide the application/json text request for first name and last name.
Also supports PUT and DELETE for doctors.

3. To fetch the static appointments: 
GET: localhost:8080/appointment/ will fetch the appointments from static hardcoded mocked data. 
Also supports PUT, POST and DELETE for Appointments. 

Spring Boot is a new technology that I chose to work on this test so was still learning about the foreign key constructs for the backend web app development. 
