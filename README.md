# Steps to kill any process running on port 8080 because tomcat server will need it to run these projects.
Windows:
netstat -ano | findstr :8080
taskkill /PID <pid> /F

Linux:
sudo lsof <process>
sudo kill -9 <pid>

#testmaven - Basic Rest API
http://localhost:8080/

#simplerestapi - Simple Rest API
http://localhost:8080/employees/

#restapi - Rest API
http://localhost:8080/employees/
