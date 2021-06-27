# reactive-demo
PoC spring webflux

Just a simple example to use reactive programming using a rest controller and
some mysql repository.

To start the mysql repository just execute `docker/docker-compose up`

To start the application just execute `mvn spring-boot:run`

Some test examples:

`curl --location --request GET 'http://localhost:8080/students'`


`curl --location --request PUT 'http://localhost:8080/students/4'
--header 'Content-Type: application/json'
--data-raw '{
"name" : "Minolles updated"
}'`

Some response examples:

`{"success":true,"message":"Student updated successfully","data":{"student":{"id":4,"name":"Minolles updated","registeredOn":1624791970441,"status":1}}}%`