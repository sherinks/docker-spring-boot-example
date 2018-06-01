# docker-spring-boot-example
A simple application in spring boot connecting to postgresql database which runs in docker. Maven is the build tool.
 
To run the application do the following
1. mvn install
2. docker-compose build
3. docker-compose up
 
Find the ip of the docker instance using
docker inspect <docker-container-id>

http://(docker-ip):8080/dockerspringboot/users

This will print the users from the postgres database.

To bring the server down
1.docker-compose down (from the folder where docker-compose up was issued)
