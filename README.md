# Rest API Demo

### API documentation
[Swagger UI](/swagger-ui.html)

### Sample commands
```console
curl -X GET -H "Content-Type: application/json" http://localhost:8080/api/hello
curl -X GET -H "Content-Type: application/json" http://localhost:8080/api/hello/John
curl -X GET -H "Content-Type: application/json" http://localhost:8080/api/documents
curl -X GET -H "Content-Type: application/json" http://localhost:8080/api/contacts
curl -X POST "http://localhost:8080/api/contacts" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"createdTime\": \"2018-06-19T16:32:52.909Z\", \"email\": \"kobe.bryant@nba.com\", \"firstName\": \"Kobe\", \"id\": \"1\", \"lastModifiedTime\": \"2018-06-19T16:32:52.909Z\", \"lastName\": \"Bryant\", \"phone\": \"29932111\"}"
```