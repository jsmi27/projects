# Steps to kill any process running on port 8080 because tomcat server will need it to run these projects.
Windows:
netstat -ano | findstr :8080       <br/>
taskkill /PID <pid> /F             &nbsp;

Linux:
sudo lsof <process>                <br/>
sudo kill -9 <pid>                 &nbsp;

#testmaven - Basic Rest API        </br>
http://localhost:8080/

#simplerestapi - Simple Rest API   </br>
http://localhost:8080/employees/

#restapi - Rest API                </br>
http://localhost:8080/employees/
