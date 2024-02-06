# Software Engineering 002: Spring Boot Web Application

This project demonstrates the creation of a simple web application using Spring Boot.
It features a single RESTful endpoint that responds differently based on the query parameter provided.

## Endpoint Description

The application exposes a GET endpoint:

/v1/student/name?formal={true|false}


This endpoint behaves according to the `formal` query parameter:

- `formal=false` returns the first name of the student.
- `formal=true` returns the full name of the student.

## Testing the Application

You can test the application by accessing the following URLs in your web browser or using a tool like `curl`:

- For informal name (first name):
http://localhost:8080/v1/student/name?formal=false

- For formal name (full name):
http://localhost:8080/v1/student/name?formal=true


## Screenshot

Below is a screenshot demonstrating the response from the application:
<img width="605" alt="Software-Engineering-response-002" src="https://github.com/m-4-s-h-4/Software-Engineering-002/assets/76568559/7262e043-562e-48ee-828f-4e07059abbb5">
