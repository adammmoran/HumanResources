**Run**
* Run Application

**Queries**

* Get all departments:

    _curl -X GET http://localhost:8080/api/departments | json_
    
* Get all positions:

    _curl -X GET http://localhost:8080/api/positions | json_    

* Get all persons:

    _curl -X GET http://localhost:8080/api/persons | json_
    
* Get all projects:

    _curl -X GET http://localhost:8080/api/projects | json_
    
* Add new department to DB:

    _curl -X POST http://localhost:8080/api/add/department | json_
* Add new person to DB:
    
    _curl -X POST http://localhost:8080/api/add/person | json_
* Add new position to DB:

    _curl -X POST http://localhost:8080/api/add/position | json_
* Add new project to DB:
    
    _curl -X POST http://localhost:8080/api/add/project | json_  
    
* ...  