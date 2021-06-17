FROM openjdk:11
COPY Calculadora.java /app/
WORKDIR /app
RUN javac Calculadora.java
ENTRYPOINT ["java", "Calculadora"]