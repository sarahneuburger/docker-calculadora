# **Calculadora**

**Objetivo:**
<br>O programa engloba uma calculadora que realiza as operações simples matemáticas, sendo: adição, subtração, multiplicação e divisão.
<br>Este repositório, possui o código fonte da Calculadora utilizado para a criação da imagem Docker disponível em: sarahnbrito/calculadora. Consta no mesmo também, o arquivo de configuração Dockerfile, na pasta raiz e descrito nas seções abaixo.

**Execução:** 
- Para executar o projeto é necessário ter a JDK11 instalada, conforme configurações do arquivo Dockerfile;
- Para que ocorra o "run" do projeto, executar o comando: `docker run -i -t sarahnbrito/calculadora` (as ações "-i e -t" são requeridas para que a classe Scanner do Java seja interpretada e haja a interação via console).

**Dockerfile:**
<br>Seguem dados do arquivo Dockerfile, resposável com as configurações utilizadas para construir o container:

```
FROM openjdk:11

COPY Calculadora.java /app/

WORKDIR /app

RUN javac Calculadora.java

ENTRYPOINT ["java", "Calculadora"]
```

**Autora:**

- **Nome:** Sarah Neuburger Brito;
- **E-mail:** sarahneuburger94@gmail.com.
