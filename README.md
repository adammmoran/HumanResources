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
* Update department :

    _curl -X PUT http://localhost:8080/api/department/update/{id} | json_
* Update person :
    
    _curl -X PUT http://localhost:8080/api/person/update/{id} | json_
* Update position :

    _curl -X PUT http://localhost:8080/api/position/update/{id} | json_
* Update project :
    
    _curl -X PUT http://localhost:8080/api/project/update/{id} | json_
* Delete department from DB:

    _curl -X Delete http://localhost:8080/api/department/delete/{id} | json_
* Delete person from DB:
    
    _curl -X Delete http://localhost:8080/api/person/delete/{id} | json_
* Delete position from DB:

    _curl -X Delete http://localhost:8080/api/position/delete/{id} | json_
* Delete project from DB:
    
    _curl -X Delete http://localhost:8080/api/project/delete/{id} | json_      
* ...   
    