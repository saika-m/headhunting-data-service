# Headhunting Data Service

This project is a backend service for a headhunting (recruitment) system, developed using **Spring Boot**. It provides RESTful APIs to manage job listings, candidate profiles, and applications.

## Features

- **Spring Boot Framework**: Simplifies the bootstrapping and development of Java applications.
- **RESTful APIs**: Manage job postings, candidate information, and application processes.
- **In-Memory Database**: Utilizes H2 for development and testing purposes.
- **MVC Architecture**: Clean separation of concerns with Spring's Model-View-Controller design.
- **Dependency Management**: Managed by Maven for efficient build processes.

## Quick Start

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Maven**: Dependency management tool.
- **Git**: Version control system.

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/saika-m/headhunting_service_springboot.git
   cd headhunting_service_springboot
   ```

2. **Build the project**:

   ```bash
   mvn clean install
   ```

3. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## Project Structure

* `src/main/java`: Contains the Java source code.
* `src/main/resources`: Application configuration and templates.
* `pom.xml`: Maven configuration file.

## Available Endpoints

* `GET /jobs`: Retrieve all job listings.
* `POST /jobs`: Create a new job listing.
* `GET /candidates`: Retrieve all candidate profiles.
* `POST /candidates`: Create a new candidate profile.
* `POST /applications`: Submit a new application.

## Development

### Running Tests

```bash
mvn test
```

## License

This project is licensed under the Apache 2.0 License. See the [LICENSE](LICENSE) file for details.

## Tags

spring boot, recruitment, headhunting, REST API, Java, backend, MVC, Maven
