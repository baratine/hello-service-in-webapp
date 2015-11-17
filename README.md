# hello-service-in-webapp
Demonstrates deploying Baratine Service into a web application archive

Build the war file with

    mvn clean package
   
Deploy the war file into a hello context of Tomcat 8.0.28 or Resin 4.0.46 or better 
and start the container.

Access your service via curl

    curl 'http://localhost:8080/hello/jamp/hello?m=hello&p0=World'
    
Servlet TestServlet is deployed at /test and demonstrates invoking Service
using java code. Servlet can be accessed at url /test
    
    curl 'http://localhost:8080/hello/test'


