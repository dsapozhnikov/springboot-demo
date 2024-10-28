# Use Axiom JDK Pro base image
FROM bellsoft.azurecr.io/liberica-runtime-container

# Set the working directory inside the container
WORKDIR /app

# Copy the project’s build output (JAR) into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose the port on which the app will run
EXPOSE 8080

# Define the entry point for running the application
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
