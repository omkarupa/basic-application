FROM openjdk:17

COPY target/symbiosys.jar /app/symbiosys.jar

WORKDIR /app

CMD [ "java","-jar","symbiosys.jar" ]