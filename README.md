# Toy Store Application

This is a simple Spring Boot application that provides CRUD (Create, Read, Update, Delete) operations for managing toys in a toy store inventory.

## Features

- Add new toys to the inventory
- Retrieve details of a specific toy
- Retrieve a list of all available toys
- Update the price and other details of a toy
- Delete toys from the inventory

## Technologies Used

- Java
- Spring Boot
- MySQL
- Hibernate

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Maven
- MySQL Server

### Installation

1. Clone the repository: git clone https://github.com/your-username/toy-store-app.git
2. Navigate to the project directory.
3. Configure the MySQL database connection in `application.properties` file.
4. Build the project: mvn clean install
5. Run the application.

The application will start running on `http://localhost:8191`.

## Usage

Once the application is running, you can use tools like Postman or cURL to interact with the available endpoints:

- `GET /toys`: Retrieve a list of all toys
- `GET /toys/{id}`: Retrieve a specific toy by ID
- `POST /toys`: Create a new toy
- `PUT /toys/{id}`: Update an existing toy
- `DELETE /toys/{id}`: Delete a toy