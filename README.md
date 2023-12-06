# code-example-open-telemetry
## steps
1. `cd ./ms-one/`
2. `mvn clean package`
3. `cd ..`
4. `cd ./ms-two/`
5. `mvn clean package`
6. `cd ..`
7. `docker compose up`
8. go to http://localhost:16686/search in your browser - check, jaeger is works
9. send POST request

### POST
#### terminal 
```
curl -X POST -d "{\"customerName:\"alex\"}" -H "Content-Type: application/json" http://localhost:8080/customer
```
#### postman
- method - POST
- URL - http://localhost:8080/customer
- body - raw
```json
{
  "customerName" : "alex"
}
```

10. go to http://localhost:16686/search in your browser - check ms-one trace
11. send GET request

### GET
#### terminal 
```
curl http://localhost:8080/customer 
```
#### postman
- method - GET
- URL - http://localhost:8080/customer
- body - none

12. go to http://localhost:16686/search in your browser - check ms-two trace
