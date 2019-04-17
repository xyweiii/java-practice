docker search mongo 

docker  pull mongo 

docker run -p 37017:27017 -v /data/docker/mongo/db:/data/db  -d mongo --auth

docker exec -it  xxxid  /bin/bash 

use admin 


db.createUser( { user: "root", pwd: "root", roles: [ { role: "root", db: "admin" } ] } );
