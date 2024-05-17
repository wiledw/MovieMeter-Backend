# MovieMeter-Backend

A backend repo for movie-reviews web application built from Java Spring Boot and using MongoDB for database

What's in the backend:
1. RESTful API for the movie reviews.
2. OAuth2 Login Implementation. (Github and Google)
   

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


