# This is basic Spring Boot Project to use CRUD operations and MongoDB as Database

### Prerequisite

1. Java
2. MongoDB Atlas Account
  a. Create shared database for free and create collection
3. Postman for testing

### How to install and run project

1. Clone the repository
2. Open project in Intellij (or your favourite IDE)
3. Open application.properties file (path: joblisting/sec/main/resources/application.properties)
  a. Edit spring.data.mongodb values according to which were created in MongoDB Atlas
3. Run JoblistingApplication (path: joblisting/sec/main/java/com.stasih.joblisting/JoblistingApplication.java

### How to use application

1. There are 3 methods in PostController class created for this project:
  a. createPost() - This method will create availale post. Go to postman and set method as POST and URL as http://localhost:8080/post and in body enter following payload
  
    {
      "profile": "SD-1",
      "description": "Required a Java Developer",
      "experience": 2,
      "technologies": [
        "Java",
        "Python"
      ]
    }
    This will create post in database verify in MongoDB Atlas and verify, similarly create other posts.
    
  b. getAllPosts() - This method will give list of all available posts. Go to postman and set method as GET and URL as http://localhost:8080/posts and send request.
  c. search() - This method searches keyword entered in profile, description and technlogies of available posts and resturns results if found. Go to postman and set method as GET and URL as http://localhost:8080/posts/searchtext and send request. It will return list based on searchtext value. 
