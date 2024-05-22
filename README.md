# MovieMeter-Backend

A backend repo for movie-reviews web application built from Java Spring Boot and using MongoDB for database

What's in the backend:
1. RESTful API for the movie reviews. Containing Controller, Service and Repository
   Description:
   - Controller: Management of the REST interface of the business logic, handling the CRUD operations
   - Service: Business logic implementations
   - Repository: Model/Entity in the system
2. OAuth2 Login Implementation. (Github and Google)
   Description:
   - Created simple login with Google and Github using the OAuth package.
3. Simple Unit testing with Mockito and JUnit
   Description:
    - Created simple unit testing with Mockito and JUnit
    - Arrange: Test case preparation, which arranging input and targets
    - Act: Act by calling function or method using what we setup in arrange
    - Asser: Compare Act result with Targets.
   

To run the backend, run the MovieMeterApplication.java file.
Do not forget to setup your own MongoDB and input your Mongo credentials


To create github client id and secret:
1. Go to github.com
2. Go to settings
3. Developer settings
4. OAuth Apps
5. Create and set homepage url to your localhost and Authorization callback to {your-localhost}/login/oauth2/code/github

To create google client id and secret:
1. Go to google cloud
2. Go to API & Services
3. Fill in consent
4. Create Project and set homepage url to your localhost and Authorization callback to {your-localhost}/login/oauth2/code/google


