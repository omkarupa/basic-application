FROM openjdk:17

COPY target/symbiosys.jar /app/symbiosys.jar

EXPOSE 8090

WORKDIR /app

CMD [ "java","-jar","symbiosys.jar" ]
