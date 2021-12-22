## To build
./gradlew jibDockerBuild

## To run containers:
docker run \
  -p 8080:8080 \
  -e "JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005" \
  --rm --name myapp \
   gcr.io/myapp/jib-image

## To call endpoint:
curl --location --request GET 'http://localhost:8080/hello'

## Stopping the containers:
docker stop myapp
