docker container stop sb-docker-ready-application

docker container rm sb-docker-ready-application

docker container run --name sb-docker-ready-application -ti -p 8388:8080 sb-docker-ready-application:1.0-SNAPSHOT