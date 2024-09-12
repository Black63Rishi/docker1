FROM openjdk
WORKDIR /app
COPY . /app/
RUN javac Fibonacci.java
CMD ["java", "Fibonacci"]