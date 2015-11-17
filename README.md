# hello-service-in-webapp
Demonstrates deploying Baratine Service into a web application archive

Build the war file with

    mvn clean package
   
Deploy the war file into a hello context of Tomcat 8.0.28 or better and start 
Tomcat.

Access your service via curl

    curl 'http://localhost:8080/hello/jamp/hello?m=hello'
    
    