FROM openjdk:11
COPY ./src/main/java/br/com/sarahbrito/calculadora/baseCalculadora /app/
WORKDIR /app
RUN javac Calculadora.java
ENTRYPOINT ["java", "Calculadora"]